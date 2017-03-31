package com.meli.academy.finalproyect

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TopLevelAttribute

import grails.converters.JSON

class TendenciasController {

	def tendenciasControllerService

	def rankingCategorias(){
		def rankingCategorias
		
		if(request.getMethod() == "GET"){
			if(params['top']!=null){
				def topValue=params['top']
				rankingCategorias = tendenciasControllerService.obtenerRankingCategorias(topValue as Integer)
			}
			else{
				rankingCategorias = tendenciasControllerService.obtenerRankingCategorias(0)
			}
			render rankingCategorias as JSON
		}
		else
			render status:400
	}

	def rankingUsuarios(){
		def rankingUsuarios
		
		if(request.getMethod() == "GET"){
			if(params['top']!=null){
				def topValue=params['top']
				rankingUsuarios = tendenciasControllerService.obtenerRankingUsuarios(topValue as Integer)
			}
			else{
				rankingUsuarios = tendenciasControllerService.obtenerRankingUsuarios(0)
			}
			render rankingUsuarios as JSON
		}
		else
			render status:400
	}
	def rankingPublicacionesCalidad(){
		def rankingPublicaciones

		if(request.getMethod() == "GET"){
			if(params['top']!=null){
				def topValue=params['top']
				println topValue
				rankingPublicaciones = tendenciasControllerService.obtenerPublicacionesCalidad(topValue as Integer)
			}
			else{
				rankingPublicaciones = tendenciasControllerService.obtenerPublicacionesCalidad(0)
			}
			render rankingPublicaciones as JSON
		}
		else
			render status:400
	}
	
	def docRankingCategorias(){
		render
	}
	def docRankingUsuarios(){
		render
	}
	def docRankingPublicacionesCalidad(){
		render
	}
}
