package com.example.myproject1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast" , "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // giving the Id button and editText, and store them in variables
                val btn_time = findViewById<Button>(R.id.subbutton)
               val btn_reset = findViewById<Button>(R.id.resetbutton)
                val input_txt = findViewById<EditText>(R.id.inputtime)
                val output_txt = findViewById<TextView>(R.id.outputsug)


        //giving conditions to the buttons and plain text in using if statement
         btn_time.setOnClickListener {
            val time = input_txt.text.toString()

            if (time == "morning") {
                output_txt.text = "Croissants & Cafe mocha"
            } else if (time == "mid-morning"){
                output_txt.text = "Fruit salad & yogurt"
            }else if (time == "afternoon"){
                output_txt.text = "Salmon salad sandwich"
            }else if (time == "mid-afternoon"){
                output_txt.text = "Pistachio nuts"
            }else if (time == "dinner"){
                output_txt.text = "Tomahawk Steak & Mushrooms"
            }else if (time.isEmpty()){
                output_txt.text = "The Food Menu"

            }
            else{
                output_txt.text = "No Options Found"
            }
        }


    }
}