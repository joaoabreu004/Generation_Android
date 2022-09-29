package com.example.listatarefas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.listatarefas.api.Repository
import com.example.listatarefas.model.Categoria
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel: ViewModel() {


    val repository = Repository()

    private val _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    //MÉTODO RESPONÁVEL POR TRAZER DADOS DO REPOSITÓRIO

    fun listCategoria(){
        //  CORROTINA
        viewModelScope.launch {
            _myCategoriaResponse.value = repository.lisCategoria()
        }
    }

}