package com.radityaadiwiratama.utsa.radit_commerce

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Setting : AppCompatActivity() {
    private var lvItem: ListView? = null
    private val Kontak = arrayOf(
        "Account", "Security and account access",
        "Privacy and safety", "Notifications",
        "Accessibility, display and language",
        "Additional resources", "Proxy")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        supportActionBar!!.title = "Settings"
        lvItem = findViewById<View>(R.id.list_view2) as ListView
        val adapter = ArrayAdapter(
            this@Setting,
            R.layout.activity_setting, R.id.text1, Kontak
        )
        lvItem!!.adapter = adapter
        lvItem!!.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(
                    this@Setting, "Memilih : "
                            + Kontak[position], Toast.LENGTH_SHORT
                ).show()
            }
    }
}