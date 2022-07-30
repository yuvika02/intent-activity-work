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
    var stg:String = " "
    var chr:Char= 'a'
    var db:Double= 0.0
    var floats:Float= 0.0F
    var bool:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
                getstring=findViewById(R.id.getstg)
                getchar=findViewById(R.id.getchr)
                getdouble=findViewById(R.id.getdb)
                getfloats=findViewById(R.id.getfloats)
        getbool=findViewById(R.id.getbool)
                intent?.let {
                    stg = it.getStringExtra("string").toString()
                    chr = it.getCharExtra("char",'a')
                    db= it.getDoubleExtra("db",0.0)
                    floats = it.getFloatExtra("floats",0.0F)
                 bool = it.getBooleanExtra("bool",true)
                }
                getstring.settext(String)

        getchar.text = ""+Char

        getdouble.text = ""+Double.toString()
        getfloats.text = ""+floats.toString()
        getbool.text = ""+bool.toString()
            }
        }


