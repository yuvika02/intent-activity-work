package com.example.differentdatatypesusinginintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
            lateinit var string:EditText

            lateinit var Char:EditText
            lateinit var double:EditText

            lateinit var floats: EditText
            lateinit var bool: EditText

            lateinit var btn: Button
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                string= findViewById(R.id.string)
                Char =findViewById(R.id.Char)
                double=findViewById(R.id.Double)
                floats = findViewById(R.id.floats)
                bool = findViewById(R.id.bool)
                btn=findViewById(R.id.btn)
                btn.setOnClickListener {
                    var intent= Intent(this,login::class.java)
                    intent.putExtra("string",string.text.toString())
                    intent.putExtra("char",Char.text.toString())
                    intent.putExtra("double",(double.text.toString()).toDouble())
                    intent.putExtra("Float",(floats.text.toString()).toFloat())

                    startActivity(intent)
                }
            }
        }
