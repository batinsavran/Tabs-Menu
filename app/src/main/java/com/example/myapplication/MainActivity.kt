package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityHomeBinding
import com.example.myapplication.home.ActiveJobFragment
import com.example.myapplication.home.PastJobFragment
import com.google.android.material.tabs.TabLayout
import com.example.myapplication.databinding.FragmentActiveJobBinding // ActiveJobFragment için
import com.example.myapplication.databinding.FragmentPastJobBinding // PastJobFragment için


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
