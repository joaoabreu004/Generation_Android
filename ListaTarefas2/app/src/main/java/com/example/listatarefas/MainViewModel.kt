package com.example.listatarefas

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.listatarefas.api.Repository
import com.example.listatarefas.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject


// ELE SABE QUE ESSA CLASSE É UM HILT VIEW MODEL
@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
        ) : ViewModel(){

    private val _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    init {

    }


    //MÉTODO RESPONÁVEL POR TRAZER DADOS DO REPOSITÓRIO

    fun listCategoria(){
        //  CORROTINA
        viewModelScope.launch {
            //EVITAR QUE SEJA COLOCADO INFORMAÇÕES INDESEJADAS E EVITANDO QUE NOSSO PROGRAMA QUEBRE
            try {
                val response = repository.lisCategoria()
                _myCategoriaResponse.value = response
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

}