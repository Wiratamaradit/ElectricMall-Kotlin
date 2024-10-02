package com.radityaadiwiratama.utsa.radit_commerce

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Phone3 : AppCompatActivity() {
    private var contactus: Button? = null
    private var previous: Button? = null
    private var home: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone3)

        contactus = findViewById<View>(R.id.btn_Contact) as Button
        previous = findViewById<View>(R.id.btnprevious2) as Button
        home = findViewById<View>(R.id.btnhome) as Button

        contactus!!.setOnClickListener {
            val contact = Intent(applicationContext, ContactUs::class.java)
            startActivity(contact)
        }
        previous!!.setOnClickListener {
            val kembali = Intent(applicationContext, Phone2::class.java)
            startActivity(kembali)
        }
        home!!.setOnClickListener {
            val home = Intent(applicationContext, MainActivity::class.java)
            startActivity(home)
        }
    }
}