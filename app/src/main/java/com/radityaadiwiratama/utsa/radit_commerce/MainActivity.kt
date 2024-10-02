package com.radityaadiwiratama.utsa.radit_commerce

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var Btn_computer: Button? = null
    private var Btn_phone: Button? = null
    private var Btn_homeservice: Button? = null
    private var Btn_regis: ImageButton? = null
    private var Btn_pay: ImageButton? = null
    private var Btn_service: ImageButton? = null
    private var Btn_deliver: ImageButton? = null
    private var Btn_contact: ImageButton? = null
    private var Btn_setting: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Btn_computer = findViewById<View>(R.id.btncomputer) as Button
        Btn_phone = findViewById<View>(R.id.btnphone) as Button
        Btn_homeservice = findViewById<View>(R.id.btnhome) as Button
        Btn_regis = findViewById<View>(R.id.btnregis) as ImageButton
        Btn_pay = findViewById<View>(R.id.btnpay) as ImageButton
        Btn_service = findViewById<View>(R.id.btnservice) as ImageButton
        Btn_deliver = findViewById<View>(R.id.btndelivery) as ImageButton
        Btn_contact = findViewById<View>(R.id.btncontact) as ImageButton
        Btn_setting = findViewById<View>(R.id.btnsetting) as ImageButton

        Btn_computer!!.setOnClickListener {
            val computer = Intent(applicationContext, Computer::class.java)
            startActivity(computer)
        }
        Btn_phone!!.setOnClickListener {
            val phone = Intent(applicationContext, Phone::class.java)
            startActivity(phone)
        }
        Btn_homeservice!!.setOnClickListener {
            val homeservice = Intent(applicationContext, Homeservice::class.java)
            startActivity(homeservice)
        }
        Btn_regis!!.setOnClickListener {
            val regis = Intent(applicationContext, Registration::class.java)
            startActivity(regis)
        }
        Btn_pay!!.setOnClickListener {
            val pay = Intent(applicationContext, Paybill::class.java)
            startActivity(pay)
        }
        Btn_service!!.setOnClickListener {
            val service = Intent(applicationContext, Service::class.java)
            startActivity(service)
        }
        Btn_deliver!!.setOnClickListener {
            val deliver = Intent(applicationContext, Delivery::class.java)
            startActivity(deliver)
        }
        Btn_contact!!.setOnClickListener {
            val contact = Intent(applicationContext, Contact::class.java)
            startActivity(contact)
        }
        Btn_setting!!.setOnClickListener {
            val setting = Intent(applicationContext, Setting::class.java)
            startActivity(setting)
        }
    }
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click Back again to Exit", Toast.LENGTH_LONG).show()
        Handler(Looper.getMainLooper()).postDelayed(Runnable { doubleBackToExitPressedOnce = false },2000)
    }
}