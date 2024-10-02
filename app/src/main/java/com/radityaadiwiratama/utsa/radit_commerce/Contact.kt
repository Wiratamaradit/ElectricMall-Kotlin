package com.radityaadiwiratama.utsa.radit_commerce

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Contact : AppCompatActivity() {
    private var home: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        home = findViewById<View>(R.id.btnhome3) as Button

        home!!.setOnClickListener {
            val home = Intent(applicationContext, MainActivity::class.java)
            startActivity(home)
        }
    }
}