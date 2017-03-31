class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"Tendencias", action:"docRankingIndex")
        "500"(view:'/error')
//		"/usuarios/$idUsuario/publicaciones"(controller:"API",action:"mostrarPublicacionesUsuario")
		"/publicaciones/$idPublicacion"(controller:"API", action:"mostrarPublicacion")
		"/publicaciones"(controller:"API", action:"mostrarPublicacionesUsuario")
		"/trends/top-categories"(controller:"Tendencias", action:"rankingCategorias", param:'top')
		"/trends/top-users"(controller:"Tendencias", action:"rankingUsuarios", param:'top')
		"/trends/top-quality-publications"(controller:"Tendencias", action:"rankingPublicacionesCalidad", param:'top')
		
		"/trends/docs"(controller:"Tendencias", action:"docRankingIndex")
		"/trends/docs/top-categories"(controller:"Tendencias", action:"docRankingCategorias")
		"/trends/docs/top-users"(controller:"Tendencias", action:"docRankingUsuarios")
		"/trends/docs/top-quality-publications"(controller:"Tendencias", action:"docRankingPublicacionesCalidad")
	}
}
