package com.example.ejercicio4

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var edCadena:EditText
    lateinit var chkNegra:CheckBox
    lateinit var chkCursiva:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edCadena = findViewById(R.id.edCadena)
        chkCursiva = findViewById(R.id.chkCursiva)
        chkNegra = findViewById(R.id.chkNegra)


    }
    fun verificaCheck(view: View) {
        edCadena.typeface = Typeface.DEFAULT
        if (chkCursiva.isChecked && chkNegra.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }else if(chkNegra.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }else if(chkCursiva.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else {
            edCadena.typeface = Typeface.DEFAULT
        }
    }
}