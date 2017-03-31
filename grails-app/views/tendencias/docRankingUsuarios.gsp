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
									<dd>/categories/:id</dd>
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
							<dt class="attribute">settings</dt>
							<dd>
								Configuration for this category.
								<dl>
									<dt>Attributes</dt>
									<dd>
										<dl>
											<dt class="attribute">adult_content</dt>
											<dd>Indicate if this category contains adult content</dd>
											<dt class="attribute">buying_allowed</dt>
											<dd>Indicate if it is posible to buy an item that
												belongs to this category</dd>
											<dt class="attribute">buying_modes</dt>
											<dd>
												Buying modes allowed in this category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">auction</dt>
															<dd>Auction</dd>
															<dt class="attribute">buy_it_now</dt>
															<dd>Buy it now</dd>
															<dt class="attribute">classified</dt>
															<dd>Classified</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">coverage_areas</dt>
											<dd>
												Indicates if it is posible to set coverage areas for the
												items that belong to this category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">not_allowed</dt>
															<dd>Not allowed</dd>
															<dt class="attribute">optional</dt>
															<dd>Optional</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">immediate_payment</dt>
											<dd>Indicates if online payment is mandatory for the
												items that belong to this category</dd>
											<dt class="attribute">item_conditions</dt>
											<dd>
												Item conditions allowed for items that belongs to this
												category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">new</dt>
															<dd>New</dd>
															<dt class="attribute">not_especified</dt>
															<dd>Not especified</dd>
															<dt class="attribute">used</dt>
															<dd>Used</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">item_reviews_allowed</dt>
											<dd>Indicates if reviews can be made for items that
												belong to this category</dd>
											<dt class="attribute">listing_allowed</dt>
											<dd>Indicates if items can be listed in this category</dd>
											<dt class="attribute">max_pictures_per_item</dt>
											<dd>Maximum number of pictures that can have an item
												listed in this category</dd>
											<dt class="attribute">mirror_category</dt>
											<dd>Indicates if there is a mirror category for this
												category</dd>
											<dt class="attribute">mirror_master_category</dt>
											<dd>Indicates which is the mirror master category of
												this mirror slave category. Mirror categories are equivalent
												categories, with the same configurations, structure and
												items. Mirror master categories are the ones that receive
												changes in their configurations.</dd>
											<dt class="attribute">mirror_slave_categories</dt>
											<dd>Indicates which are the mirror slave categories of
												this mirror master category. Mirror categories are
												equivalent categories, with the same configurations,
												structure and items. Mirror slave categories are copies of a
												mirror master category in other category trees.</dd>
											<dt class="attribute">price</dt>
											<dd>
												Indicates if price is mandatory for the items that belong to
												this category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">optional</dt>
															<dd>Optional</dd>
															<dt class="attribute">required</dt>
															<dd>Requered</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">seller_contact</dt>
											<dd>
												Indicates if seller contact information is mandatory for the
												items that belong to this category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">now_allowed</dt>
															<dd>Not allowed</dd>
															<dt class="attribute">optional</dt>
															<dd>Optional</dd>
															<dt class="attribute">required</dt>
															<dd>Required</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">shipping_modes</dt>
											<dd>
												Shipping modes available for items that belong to this
												category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">carrier</dt>
															<dd>me2</dd>
															<dt class="attribute">custom</dt>
															<dd>not_especified</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">shipping_options</dt>
											<dd>
												Shipping options available for items that belong to this
												category
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">carrier</dt>
															<dd>Set by carrier</dd>
															<dt class="attribute">custom</dt>
															<dd>Set by seller</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">shipping_profile</dt>
											<dd>
												Indicates if items that belong to this category have a
												shipping profile associated
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">now_allowed</dt>
															<dd>Not allowed</dd>
															<dt class="attribute">optional</dt>
															<dd>Optional</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">show_contact_information</dt>
											<dd>Indicates if seller contact information must be
												shown for items that belong to this category</dd>
											<dt class="attribute">simple_shipping</dt>
											<dd>
												Indicates if the seller can add shipping information for
												posible locations
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">now_allowed</dt>
															<dd>Not allowed</dd>
															<dt class="attribute">optional</dt>
															<dd>Optional</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">stock</dt>
											<dd>
												Indicates if items that belong to this category can handle
												stock
												<dl>
													<dt>Attributes</dt>
													<dd>
														<dl>
															<dt class="attribute">optional</dt>
															<dd>Optional</dd>
															<dt class="attribute">required</dt>
															<dd>Required</dd>
														</dl>
													</dd>
												</dl>
											</dd>
											<dt class="attribute">tags</dt>
											<dd>Tags for this category</dd>
											<dt class="attribute">vip_subdomain</dt>
											<dd>Subdomain for this category</dd>
										</dl>
									</dd>
								</dl>
							</dd>
							<dt class="attribute">total_items_in_this_category</dt>
							<dd>Number of active items listed in this category or in one
								of his subcategories</dd>
						</dl>
					</dd>
					<dt class="collapsable">Related resources</dt>
					<dd>
						&nbsp;
						<dl>
							<dd>attributes</dd>
							<dd>categories</dd>
							<dd>shipping</dd>
						</dl>
					</dd>
				</dl>
			</section>
		</div>
	</div>

</body>
</html>