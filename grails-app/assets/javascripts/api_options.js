//////////////////////////////// TABS

var Tabs = function (){
	var _self = this;

	_self.tabs = {};
	var triggers = document.querySelectorAll ("nav.tabs ul li a");

	var i = 0, t = triggers.length;
	for (; i < t; i++) {
		var contentId = triggers[i].getAttribute ("href");
		
		var content = document.querySelector (contentId);
		if (content) {
			var id = contentId.replace (/^#/, "");
			content.setAttribute ("tabid", id);
			content.removeAttribute ("id");
			content.style.display = "none";
	
			triggers[i].content = content;

			triggers[i].hide = function () {
				this.classList.remove ("active");
				this.content.style.display = "none";
			}
			triggers[i].show = function () {
				this.classList.add ("active");
				this.content.style.display = "block";

				_self.active && _self.active !== this && (_self.active.hide());
				_self.active = this;
			}

			triggers[i].addEventListener ("focus", function (event) {
				var e = event.target || event.srcElement;
				
				e.show ();
			}, true);

			_self.tabs[id] = triggers[i];
		}
	}

	var current = document.location.hash.replace (/^#/, "");
	if (current && _self.tabs[current]) {
		_self.tabs[current].show ();
	} else {
		var first = Object.keys(_self.tabs)[0];
		if (first) {
			_self.tabs[first].show ();
		}
	}
};

new Tabs();