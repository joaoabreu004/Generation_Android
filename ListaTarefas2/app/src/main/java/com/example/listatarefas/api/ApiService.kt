package com.example.listatarefas.api

import com.example.listatarefas.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    //VERBOS HTTP
    @GET("categoria")
    suspend fun lisCategoria(): Response<List<Categoria>>
}