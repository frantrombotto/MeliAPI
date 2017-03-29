package com.meli.academy.finalproyect

import java.net.URL;
import java.util.ArrayList;

import grails.transaction.Transactional
import groovy.json.JsonSlurper;

@Transactional
class APIControllerService {
	def connection
	JsonSlurper json
	String url = 'http://j5ajvgmc.burrow.io/PublicationManagerDbAPI'
	
	def conectarGET(URL url){
		connection = (HttpURLConnection) url.openConnection()
		connection.setRequestMethod("GET")
		connection.setRequestProperty("Accept", "application/json")
		connection.setRequestProperty("User-Agent", "Mozilla/5.0")
		json = new JsonSlurper()
	}
	
	def conectarPUT(URL url){
		connection = (HttpURLConnection) url.openConnection()
				connection.setRequestMethod("PUT")
				connection.setRequestProperty("Accept", "application/json")
				connection.setRequestProperty("User-Agent", "Mozilla/5.0")
				json = new JsonSlurper()
	}
	
	
	ArrayList obtenerPublicaciones(){
		conectarGET(new URL(url + '/publicaciones/'))
		ArrayList publicaciones = (ArrayList)json.parse(connection.getInputStream())
		return publicaciones
	}
	
	Map obtenerPublicacion(String idPublicacion){
		conectarGET(new URL(url + '/publicaciones/'+idPublicacion))
		Map publicaciones = (Map)json.parse(connection.getInputStream())
		return publicaciones
	}
	
	ArrayList obtenerPublicacionesUsuario(String idUsuario){
		conectarGET(new URL(url + '/usuarios/'+idUsuario))
		ArrayList publicacion = (ArrayList)json.parse(connection.getInputStream())
		publicacion.removeAll { it.activo.equalsIgnoreCase('n')}
		return publicacion
	}
	
	Map eliminarPublicacion(String idPublicacion){
		conectarPUT(new URL(url+ '/publicaciones/'+ idPublicacion+'?activo=n'))
		Map publicacionEliminada = (Map)json.parse(connection.getInputStream())
		return publicacionEliminada
	}
	
	def pruebaDelete(){
		return conectarGET(new URL('http://fcab8324.ngrok.io/publicacion/1/delete'))
		
	}
	
}
