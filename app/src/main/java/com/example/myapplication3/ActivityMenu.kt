package com.example.myapplication3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication3.databinding.ActivityMainBinding
import com.example.myapplication3.databinding.ActivityMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class ActivityMenu: AppCompatActivity() {
    private lateinit var binding : ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationView = findNavController(R.id.fragment_container)
        bottomNavView.setupWithNavController(navigationView)
//        changeFragment(HomeFragment())
//        binding.bottomNavigationView.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.home_menu ->{
//                    changeFragment(HomeFragment())
//                }
//                R.id.cart ->{
//                    changeFragment(CartFragment())
//                }
//                R.id.search ->{
//                    changeFragment(SearchFragment())
//                }
//                R.id.history ->{
//                    changeFragment(HistoryFragment())
//                }
//                R.id.profil ->{
//                    changeFragment(ProfilFragment())
//                }
//
//            }
//            return@setOnItemSelectedListener true
//        }
//
//    }
//    fun changeFragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragment_container, fragment)
//        fragmentTransaction.commit()
    }
}