class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
		"/publicaciones/usuario/$idUsuario"(controller:"API",action:"mostrarPublicacionesUsuario")
		"/publicacion/$idPublicacion/delete"(controller:"API", action:"eliminarPublicacion")
		"/publicacion/$idPublicacion"(controller:"API", action:"mostrarPublicacion")
		"/publicaciones/"(controller:"API", action:"mostrarPublicaciones")
	}
}
