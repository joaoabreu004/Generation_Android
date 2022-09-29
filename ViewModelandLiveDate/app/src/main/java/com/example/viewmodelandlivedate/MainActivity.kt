package com.example.viewmodelandlivedate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelandlivedate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //OBJETO MAIN VIEW MODEL (INSTANCIA DIFERENTE UTILIZANDO O V.M.P)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //MAIN ACTIVITY IRÁ OBSERVAR O DADO:
        mainViewModel.cont.observe(this){
            binding.textCont.text = it.toString()
        }

        binding.ButtonId.setOnClickListener{
            mainViewModel.addNum()

        }
    }
}