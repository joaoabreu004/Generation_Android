package com.example.viewmodelandlivedate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){

    //LIVEDATA
    var cont = MutableLiveData<Int>(0)
    fun addNum(){
        //CASO O VALOR SEJA NULO:
        cont.value = cont.value?.plus(1)
    }
}