package com.example.mvvmcyclopeapps.model

data class PokemonResponse(
    val pokemon:MutableList<PokemonDataModel> = mutableListOf()
)

data class PokemonDataModel(val id:Long,
val name:String,
val image:String)
