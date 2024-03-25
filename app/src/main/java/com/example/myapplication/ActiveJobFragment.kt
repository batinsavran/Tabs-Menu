package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentActiveJobBinding

class ActiveJobFragment : Fragment() {

    private lateinit var binding: FragmentActiveJobBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentActiveJobBinding.inflate(inflater, container, false)
        return binding.root
    }
}
