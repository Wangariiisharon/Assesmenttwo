package dev.mwangi.assesmentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CalculateActivity : AppCompatActivity() {
    lateinit var tilNumberOne: TextInputLayout
    lateinit var tilNumberTwo: TextInputLayout
    lateinit var etNumberOne: EditText
    lateinit var etNumberTwo: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    lateinit var btnCalculate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        tilNumberOne = findViewById(R.id.tilNumberOne)
        tilNumberTwo = findViewById(R.id.tilNumberTwo)
        etNumberOne = findViewById(R.id.etNumberOne)
        etNumberTwo = findViewById(R.id.etNumberTwo)
        btnAdd = findViewById(R.id.btnAdd)
        btnDivision = findViewById(R.id.btnDivision)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)
        btnCalculate=findViewById(R.id.btnCalculate)
        btnCalculate.setOnClickListener {
          validation()
        }



        btnAdd.setOnClickListener {
            var numberOne = etNumberOne.text.toString()
            var numberTwo = etNumberTwo.text.toString()
            add(numberOne.toInt(), numberTwo.toInt())
            validation()

        }

        btnModulus.setOnClickListener {
            var numberOne = etNumberOne.text.toString()
            var numberTwo = etNumberTwo.text.toString()
            modulus(numberOne.toInt(), numberTwo.toInt())
            validation()

        }
        btnSubtract.setOnClickListener {
            var numberOne = etNumberOne.text.toString()
            var numberTwo = etNumberTwo.text.toString()
            validation()
            minus(numberOne.toInt(), numberTwo.toInt())


        }
        btnDivision.setOnClickListener {
            var numberOne = etNumberOne.text.toString()
            var numberTwo = etNumberTwo.text.toString()
            division(numberOne.toInt(), numberTwo.toInt())
            validation()


        }



    }


    fun add(numberOne: Int, numberTwo: Int) {
        var sum = numberOne + numberTwo
        tvResult.text = sum.toString()
    }

    fun minus(numberOne: Int, numberTwo: Int) {
        var sub = numberOne - numberTwo
        tvResult.text = sub.toString()
    }

    fun modulus(numberOne: Int, numberTwo: Int) {
        var mod = numberOne % numberTwo
        tvResult.text = mod.toString()
    }

    fun division(numberOne: Int, numberTwo: Int) {
        var divide = numberOne / numberTwo
        tvResult.text=divide.toString()

    }


    fun validation() {
        var error = false
        tilNumberOne.error = null
        tilNumberTwo.error = null

        var numberOne = etNumberOne.text.toString()
        if (numberOne.isBlank()) {
            tilNumberOne.error = "First number is required"
        }
        var numberTwo = etNumberOne.text.toString()
        if (numberTwo.isBlank()) {
            tilNumberTwo.error = "Second number is required"
        }
    }}



