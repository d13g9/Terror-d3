package com.example.diegoterror

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etemail:EditText = findViewById(R.id.email) as EditText;
        val etpassword:EditText = findViewById(R.id.password) as EditText;
        val googlelogin:Button = findViewById(R.id.button_login) as Button;

        googlelogin.setOnClickListener(View.OnClickListener {
            /*if(!checkEMail(etemail.text.toString())) {
                Toast.makeText(this, R.string.blank_validate_email, Toast.LENGTH_SHORT).show();
                return@OnClickListener;
            }
            if(checkPassword(etpassword.text.toString())){
                Toast.makeText(this, R.string.blank_validate_password, Toast.LENGTH_SHORT).show();
                return@OnClickListener;
            }*/
            val intent:Intent = Intent(this,InsertActivity::class.java);
            startActivity(intent);


        })

    }

    private fun checkPassword(password: String): Boolean {
        return password.isEmpty();
    }

    private fun checkEMail(email:String): Boolean {
        return email.contains("@");
    }
}
