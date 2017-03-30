class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
//		"/usuarios/$idUsuario/publicaciones"(controller:"API",action:"mostrarPublicacionesUsuario")
		"/publicaciones/$idPublicacion"(controller:"API", action:"mostrarPublicacion")
		"/publicaciones"(controller:"API", action:"mostrarPublicacionesUsuario")
		"/trends/top-categories"(controller:"Tendencias", action:"rankingCategorias", param:'top')
		"/trends/top-users"(controller:"Tendencias", action:"rankingUsuarios", param:'top')
		"/trends/top-quality"(controller:"Tendencias", action:"rankingPublicacionesCalidad", param:'top')
	}
}
