package com.example.mvvmcyclopeapps.repository

import com.example.mvvmcyclopeapps.services.RetrofitClient
import com.example.mvvmcyclopeapps.services.WebService

//repository sera usado x la vista o el viewModel
class PokemonRepository {
    //se va a comunicar con la data y el view
    private var apiService:WebService? = null
    init {
        apiService = RetrofitClient.getClient?.create(WebService::class.java)

    }

    suspend fun getPokemon()= apiService?.getPokemons()

}