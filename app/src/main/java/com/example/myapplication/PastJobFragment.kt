package com.example.myapplication.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentPastJobBinding

class PastJobFragment : Fragment() {

    private lateinit var binding: FragmentPastJobBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPastJobBinding.inflate(inflater, container, false)
        return binding.root
    }
}
