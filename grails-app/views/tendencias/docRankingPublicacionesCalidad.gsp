<html>
<head>
<meta charset="utf-8">
<title>Category</title>
<meta name="description"
	content="Retrieves the information about a MercadoLibres category.">
<meta name="author" content="APIers">
<asset:stylesheet src="pygments.css" />
<asset:stylesheet src="api_options.css" />
<asset:javascript src="api_options.js"/>
<asset:javascript src="require-jquery.js"/>
</head>
<body>
	<div class="content">
		<h1>API TOP CATEGORIAS</h1>
		<h2></h2>
		<nav class="tabs">
			<ul>
				<li><a tabindex="1" class="">Documentation</a></li>
				
			</ul>
		</nav>
		<div class="tabcontents">
			<section tabid="options" style="display: block;">
				<dl class="glossary">
					<dt class="collapsable">Allowed methods</dt>
					<dd>
						&nbsp;
						<dl>
							<dd>Retrieves information of a category and its
								configuration.</dd>
							<dd>
								<dl>
									<dt>GET</dt>
									<dd>MeliAPI/trends/top-quality-publications?top=</dd>
								</dl>
							</dd>
						</dl>
					</dd>
					<dt class="collapsable">Params</dt>
					<dd>
						&nbsp;
						<dl>
							<dd>Description: Determine the number of categories that are displayed in the ranking	 </dd>
							<dd>
								<dl>
									<dt>Params</dt>
									<dd>top</dd>
									<dt>Type</dt>
									<dd>int</dd>
								</dl>
							</dd>
						</dl>
					</dd>
					<dt class="collapsable">Attributes</dt>
					<dd>
						&nbsp;
						<dl>
							<dt class="attribute">activo</dt>
							<dd>Possible values: string type</dd>
							<dt class="attribute">descripción</dt>
							<dd>name of the publication</dd>
							<dt class="attribute">id</dt>
							<dd>ID</dd>
							<dt class="attribute">idCategoria</dt>
							<dd>code of the category</dd>
							<dt class="attribute">imagenes</dt>
							<dd>Publication picture url</dd>
							<dt class="attribute">Precio</dt>
							<dd>price of the item (int)</dd>
							<dt class="attribute">stock</dt>
							<dd>stock of the item (int)</dd>
							<dt class="attribute">Titulo</dt>
							<dd>title of the item (string)</dd>
							<dt class="attribute">Valoracion</dt>
							<dd>quality of the description in the item (float 0-1)</dd>
						</dl>
					</dd>
				</dl>
			</section>
		</div>
	</div>

</body>
</html>