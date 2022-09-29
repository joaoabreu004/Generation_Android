package com.example.listatarefas.api

import com.example.listatarefas.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun lisCategoria(): Response<List<Categoria>>{
        return RetroFitInstance.api.lisCategoria()
    }
}