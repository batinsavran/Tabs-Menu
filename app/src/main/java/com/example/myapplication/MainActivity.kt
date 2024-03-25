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

    private lateinit var binding: ActivityHomeBinding

    private fun goPastJobFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, PastJobFragment())
            .commit()
    }

    private fun goActiveJobFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, ActiveJobFragment())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        goPastJobFragment()

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    when (it.position) {
                        0 -> {
                            goPastJobFragment()
                        }
                        1 -> {
                            goActiveJobFragment()
                        }
                    }
                }
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
                // Boş bırakıldı
            }

            override fun onTabReselected(p0: TabLayout.Tab?) {
                // Boş bırakıldı
            }
        })
    }
}
