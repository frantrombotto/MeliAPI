	<html>
<head>
<meta charset="utf-8">
<title>Doc Ranking Categorías</title>
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
			<g:form action="rankingCategorias" controller="Tendencias" method="GET">
				<button type="submit" >Json</button>
			</g:form>
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
									<dd>MeliAPI/trends/top-users?top=</dd>
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
							<dt class="attribute">attribute_types</dt>
							<dd>Possible values: variations|attributes|none</dd>
							<dt class="attribute">children_categories</dt>
							<dd>List of subcategories that depends on this category</dd>
							<dt class="attribute">id</dt>
							<dd>ID</dd>
							<dt class="attribute">name</dt>
							<dd>Name of the category</dd>
							<dt class="attribute">path_from_root</dt>
							<dd>Path of categories from this level up to the root
								category</dd>
							<dt class="attribute">permalink</dt>
							<dd>PermaLink</dd>
							<dt class="attribute">picture</dt>
							<dd>Category picture url</dd>
							<dt class="attribute">cantidadPublicaciones</dt>
							<dd>Show the numbers of publications in the category</dd>
						</dl>
					</dd>
				</dl>
			</section>
		</div>
	</div>

</body>
</html>