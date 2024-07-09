package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.data.RegistrationsActivity

class ChooseCountryActivity : AppCompatActivity() {
    private val cityList = arrayListOf(
        "Россия",
        "Канада",
        "Румыния",
        "Германия",
        "Китай",
        "Швеция",
        "Япония"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)
        val choose: Spinner = findViewById(R.id.ChooseCity)
        choose.adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, cityList)
        choose.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@ChooseCountryActivity, cityList[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        val choosebut: Button = findViewById(R.id.buttonChoose)
        choosebut.setOnClickListener{
            Toast.makeText(this@ChooseCountryActivity, cityList[choose.selectedItemPosition], Toast.LENGTH_LONG).show()
            val intent = Intent(this, RegistrationsActivity::class.java)
            startActivity(intent)
        }
    }
}