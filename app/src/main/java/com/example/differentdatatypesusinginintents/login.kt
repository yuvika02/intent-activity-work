package com.example.differentdatatypesusinginintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    lateinit var getstring:TextView
    lateinit var getchar:TextView
    lateinit var getdouble:TextView
    lateinit var getfloats:TextView
    lateinit var getbool: TextView
    var string:String = " "
    var char:Char= 'a'
    var double:Double= 0.0
    var float:Float = 0.0F
    var bool:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
                getstring=findViewById(R.id.getstring)
                getchar=findViewById(R.id.getchar)
                getdouble=findViewById(R.id.getdouble)
                getfloats=findViewById(R.id.getfloats)
        getbool=findViewById(R.id.getbool)
                intent?.let {
                    string = it.getStringExtra("string").toString()
                    char = it.getCharExtra("char",'a')
                    double= it.getDoubleExtra("double",0.0)
                    float= it.getFloatExtra("Float",0.0F)
                 bool = it.getBooleanExtra("bool",true)
                }
                getstring.setText(string)
        getchar.text = ""+char
        getdouble.text = ""+double.toString()
        getfloats.text = ""+float.toString()
        getbool.text = ""+bool.toString()
            }
        }


