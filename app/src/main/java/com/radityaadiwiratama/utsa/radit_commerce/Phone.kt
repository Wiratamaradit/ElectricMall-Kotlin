package com.radityaadiwiratama.utsa.radit_commerce

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Phone : AppCompatActivity() {
    private var next: Button? = null
    private var home: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        next = findViewById<View>(R.id.btnnext1) as Button
        home = findViewById<View>(R.id.btnhome) as Button

        next!!.setOnClickListener {
            val lanjut = Intent(applicationContext, Phone2::class.java)
            startActivity(lanjut)
        }
        home!!.setOnClickListener {
            val home = Intent(applicationContext, MainActivity::class.java)
            startActivity(home)
        }
    }
}