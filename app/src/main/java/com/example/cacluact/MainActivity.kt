package com.example.cacluact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var addButton: Button
    lateinit var minusButton: Button
    lateinit var divisionButton: Button
    lateinit var multiplacationButton: Button
    lateinit var edFirst: EditText
    lateinit var edSecond: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton = findViewById(R.id.btnAdd)
        minusButton = findViewById(R.id.btnMinus)
        divisionButton = findViewById(R.id.btnDivide)
        multiplacationButton = findViewById(R.id.btnTimes)
        edFirst = findViewById(R.id.edFirst)
        edSecond = findViewById(R.id.edSecond)

        addButton.setOnClickListener {
            var fn = edFirst.text.toString().toFloat()
            var sn = edSecond.text.toString().toFloat()
            var result: Float = fn + sn

            Toast.makeText(this,result.toString(), Toast.LENGTH_SHORT).show()
        }

        minusButton.setOnClickListener {
            var fn = edFirst.text.toString().toFloat()
            var sn = edSecond.text.toString().toFloat()
            var result: Float = fn - sn

            Toast.makeText(this,result.toString(), Toast.LENGTH_SHORT).show()
        }

        divisionButton.setOnClickListener {
            var fn = edFirst.text.toString().toFloat()
            var sn = edSecond.text.toString().toFloat()
            var result: Float = fn / sn

            Toast.makeText(this,result.toString(), Toast.LENGTH_SHORT).show()
        }

        multiplacationButton.setOnClickListener {
            var fn = edFirst.text.toString().toFloat()
            var sn = edSecond.text.toString().toFloat()
            var result: Float = fn * sn

            Toast.makeText(this,result.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}