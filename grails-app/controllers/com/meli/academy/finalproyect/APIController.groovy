package com.meli.academy.finalproyect


//@RestApi(name = "book services", description = "Methods for managing books")
class APIController {

	def APIControllerService

	def index() {

	}

	//	@RestApiMethod(description="Get a book")
	//	@RestApiParams(params=[
	//		@RestApiParam(name="id", type="long", paramType = RestApiParamType.PATH, description = "The book id")
	//	])

	ArrayList mostrarPublicaciones(){
		def publicaciones = APIControllerService.obtenerPublicaciones()
		render publicaciones
	}

	def mostrarPublicacionesUsuario(){
		def publicacionesUsuario = APIControllerService.obtenerPublicacionesUsuario(params.idUsuario)
		render publicacionesUsuario
	}
	
	def validarUsuario(){
		ArrayList listaUsuarios = APIControllerService.obtenerUsuarios()
		for (usuario in listaUsuarios) {
			
		}
	}
	
	def eliminarPublicacion(){
		render APIControllerService.eliminarPublicacion(params.idPublicacion)
	}
	
	def pruebaDelete(){
		render APIControllerService.pruebaDelete()
	}
}
