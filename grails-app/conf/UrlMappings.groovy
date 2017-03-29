class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
		"/usuario/$idUsuario/publicaciones"(controller:"API",action:"mostrarPublicacionesUsuario")
		"/usuario/validar"(controller:"API",action:"validarUsuario")
		"/publicacion/$idPublicacion/delete"(controller:"API", action:"eliminarPublicacion")
	}
}
