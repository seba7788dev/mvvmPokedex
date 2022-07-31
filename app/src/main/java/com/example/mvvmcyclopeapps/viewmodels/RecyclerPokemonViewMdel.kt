package com.example.mvvmcyclopeapps.viewmodels

import android.app.Application
import android.graphics.ColorSpace
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmcyclopeapps.model.PokemonDataModel
import kotlinx.coroutines.CoroutineScope

class RecyclerPokemonViewMdel(app:Application):AndroidViewModel(app),CoroutineScope {
    private val _itemSelected = MutableLiveData<PokemonDataModel>()
    var itemDataSelected:PokemonDataModel? = null


    private val _listState = MutableLiveData<MutableList<PokemonDataModel>>()
    var listState:LiveData<MutableList<PokemonDataModel>> = _listState

}