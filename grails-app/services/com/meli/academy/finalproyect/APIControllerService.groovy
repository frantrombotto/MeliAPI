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
	
	ArrayList obtenerProducto(String id){
		conectarGET(new URL('https://api.mercadolibre.com/categories/'+id))
		ArrayList mapa = (Map) json.parse(connection.getInputStream())
		ArrayList listaCategorias = mapa.get('children_categories')
		return listaCategorias
	}
	
	ArrayList obtenerPublicaciones(){
		conectarGET(new URL(url + '/publicaciones/'))
		ArrayList publicaciones = (ArrayList)json.parse(connection.getInputStream())
		return publicaciones
	}
	
	Map obtenerPublicacionesUsuario(String idUsuario){
		conectarGET(new URL(url + '/usuarios/'+idUsuario))
//		conectarGET(new URL('http://localhost:1090/usuario/'+idUsuario+"/publicaciones"))
//		Map publicaciones = (Map)json.parse(connection.getInputStream())
		Map usuario = (Map)json.parse(connection.getInputStream())
		ArrayList publicacionesUsuario = (ArrayList) usuario.publicaciones
		println publicacionesUsuario
		for (publicacion in publicacionesUsuario) {
			if(publicacion.activo == "n"){
				publicacionesUsuario.remove(publicacion)
			}
		}
		println publicacionesUsuario
		usuario.publicaciones = publicacionesUsuario
		return usuario
	}
	
	ArrayList obtenerUsuarios(){
		conectarGET(new URL('http://localhost:1090/usuarios'))
		ArrayList usuarios = (ArrayList)json.parse(connection.getInputStream())
		return usuarios
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
