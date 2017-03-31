package com.meli.academy.finalproyect

import java.net.URL
import java.util.ArrayList
import java.util.prefs.FileSystemPreferences.Put

import grails.transaction.Transactional
import groovy.json.JsonSlurper

@Transactional
class TendenciasControllerService {

	def connection
	JsonSlurper json
	String url = 'http://j5ajvgmc.burrow.io/PublicationManagerDbAPI'
	String urlMeli='https://api.mercadolibre.com'

	def conectarGET(URL url){
		connection = (HttpURLConnection) url.openConnection()
		connection.setRequestMethod("GET")
		connection.setRequestProperty("Accept", "application/json")
		connection.setRequestProperty("User-Agent", "Mozilla/5.0")
		json = new JsonSlurper()
	}

	def obtenerRankingCategorias(int top){
		conectarGET(new URL(url + '/publicaciones/'))
		ArrayList publicaciones = (ArrayList) json.parse(connection.getInputStream())
		Map contadorPublicaciones =[:]
		for (publicacion in publicaciones) {
			def categoria = publicacion.idCategoria
			if(contadorPublicaciones.containsKey(categoria)){
				contadorPublicaciones[categoria]=(contadorPublicaciones.get(categoria)+1)
			}
			else{
				contadorPublicaciones.put(categoria, 1)
			}
		}
		contadorPublicaciones=contadorPublicaciones.sort{ -it.value }

		ArrayList categorias=new ArrayList()
		for (cat in contadorPublicaciones) {
			def categoria=buscarCategoria(cat.key)
			categoria["cantidadPublicaciones"]=cat.value
			categorias.add(categoria)
		}

		if(top==0 || top > categorias.size){
			return categorias
		}
		return categorias.subList(0, top)
	}

	def obtenerRankingUsuarios(int top){
		conectarGET(new URL(url + '/publicaciones/'))
		ArrayList publicaciones = (ArrayList) json.parse(connection.getInputStream())
		Map contadorUsuarios =[:]
		for (publicacion in publicaciones) {
			def usuarioID = publicacion.usuarioID
			if(contadorUsuarios.containsKey(usuarioID)){
				contadorUsuarios[usuarioID]=(contadorUsuarios.get(usuarioID) +1)
			}
			else{
				contadorUsuarios.put(usuarioID, 1)
			}
		}
		contadorUsuarios=contadorUsuarios.sort{ -it.value }
		ArrayList usuariosJson=new ArrayList()
		for (usr in contadorUsuarios) {
			def usuario=buscarUsuario(usr.key)
			usuario["cantidadPublicaciones"]=usr.value
			usuariosJson.add(usuario)
		}

		if(top==0 || top > usuariosJson.size){
			return usuariosJson
		}
		return usuariosJson.subList(0, top)
	}

	def obtenerPublicacionesCalidad(int top){
		conectarGET(new URL(url + '/publicaciones/'))
		ArrayList publicaciones = (ArrayList) json.parse(connection.getInputStream())
		publicaciones=publicaciones.sort{ -it.valoracion }

		if(top==0 || top > publicaciones.size){
			return publicaciones
		}
		return publicaciones.subList(0, top)
	}

	def buscarUsuario(int usuarioID){
		conectarGET(new URL(urlMeli + '/users/'+usuarioID))
		return json.parse(connection.getInputStream())
	}

	def buscarCategoria(String idCategoria){
		conectarGET(new URL(urlMeli+'/categories/'+idCategoria))
		return  json.parse(connection.getInputStream())
	}
}
