package dev.mwangi.assesmentcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnGetStarted:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGetStarted=findViewById(R.id.btnGetStarted)
        btnGetStarted.setOnClickListener {
            var intent=Intent(this,CalculateActivity::class.java)
            startActivity(intent)
        }
    }
}