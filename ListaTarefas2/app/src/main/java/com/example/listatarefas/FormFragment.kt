package com.example.listatarefas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.listatarefas.databinding.FragmentFormBinding
import com.example.listatarefas.databinding.FragmentListBinding


class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)


//        val buttonCriar = view.findViewById<Button>(R.id.buttonSalvar)

        binding.buttonSalvar.setOnClickListener{
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        return view
    }
}