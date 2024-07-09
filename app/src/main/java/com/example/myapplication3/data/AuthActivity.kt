package com.example.myapplication3.data

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication3.ActivityMenu
import com.example.myapplication3.ChooseCountryActivity
import com.example.myapplication3.MainActivity
import com.example.myapplication3.R

class AuthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val userLogin: EditText = findViewById(R.id.user_login_auth)
        val userPass: EditText = findViewById(R.id.user_pass_auth)
        val button: Button = findViewById(R.id.button_reg_auth)
        val linkToReq: TextView = findViewById(R.id.link_to_req)
        val linkToGen: TextView = findViewById(R.id.link_to_gen)
        val visiblePas: CheckBox = findViewById(R.id.visible_password)


      linkToReq.setOnClickListener {
          val intent = Intent(this, ChooseCountryActivity::class.java)
          startActivity(intent)
      }
        linkToGen.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        visiblePas.setOnClickListener {
            if(visiblePas.isChecked){
                userPass.inputType = 1
            }else{
                userPass.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }

        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()


            if (login == "" || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else {

                    val db = DbHelper(this, null)
                    val isAuth = db.getUser(login, pass)
                    if (isAuth) {

                        Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_LONG)
                            .show()
                        val intent = Intent(this, ActivityMenu::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(
                            this,
                            "Пользователь $login не авторизован",
                            Toast.LENGTH_LONG
                        ).show()

                    }

            }


        }
    }
}



