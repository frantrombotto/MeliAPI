package com.meli.academy.finalproyect

import grails.converters.JSON


//@RestApi(name = "book services", description = "Methods for managing books")
class APIController {

	def APIControllerService

	def index() {

	}

	//	@RestApiMethod(description="Get a book")
	//	@RestApiParams(params=[
	//		@RestApiParam(name="id", type="long", paramType = RestApiParamType.PATH, description = "The book id")
	//	])

	def mostrarPublicaciones(){
		if(request.getMethod() == "GET"){
			def publicaciones = APIControllerService.obtenerPublicaciones()
			render publicaciones as JSON
		}
		else
			render status:400
	}
	
	def mostrarPublicacion(){
		if(request.getMethod() == "GET"){
			def publicaciones = APIControllerService.obtenerPublicacion(params.idPublicacion)
			render publicaciones as JSON
		}
		if(request.getMethod() == "DELETE"){
			APIControllerService.eliminarPublicacion(params.idPublicacion)
			render status:204
		}
	}

	def mostrarPublicacionesUsuario(){
		if(request.getMethod() == "GET"){
			def publicacionesUsuario = APIControllerService.obtenerPublicacionesUsuario(params.idUsuario)
			render publicacionesUsuario as JSON
		}
		else
			render status:400
	}


	
	
}
