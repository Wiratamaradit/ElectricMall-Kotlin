package com.radityaadiwiratama.utsa.radit_commerce

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Computer2 : AppCompatActivity() {
    private var next: Button? = null
    private var previous: Button? = null
    private var home: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer2)

        next = findViewById<View>(R.id.btnnext2) as Button
        previous = findViewById<View>(R.id.btnprevious1) as Button
        home = findViewById<View>(R.id.btnhome) as Button

        next!!.setOnClickListener {
            val lanjut2 = Intent(applicationContext, Computer3::class.java)
            startActivity(lanjut2)
        }
        previous!!.setOnClickListener {
            val kembali = Intent(applicationContext, Computer::class.java)
            startActivity(kembali)
        }
        home!!.setOnClickListener {
            val home = Intent(applicationContext, MainActivity::class.java)
            startActivity(home)
        }
    }
}