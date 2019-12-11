package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher, View.OnClickListener {



    private var EditName : EditText? = null // en Kotlin no se permiten objetos nulos por lo que lo forzamos con esta linea
    // en kotlin no es necesario utilizar punto y coma
    private var EditAge : EditText? = null
    private var TextViewName : TextView? = null
    private var TextViewAge : TextView?=null

    private var name : String? = null
    private var age : String? = null
    // en kotlin no es necesario que deblare el tipo de variable... basta con ponerle el dato y kotlin interpretara que tipo de dato es
    // la unica diferencia es que se pone = para poner el dato , caso contrario se pone :

    private var boton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditName = findViewById(R.id.editText_nombre) as EditText
        EditAge = findViewById(R.id.editText_edad) as EditText
        TextViewName = findViewById(R.id.textView_Name) as TextView
        TextViewAge = findViewById(R.id.textView_Age) as TextView

        boton = findViewById(R.id.button_ejecutar) as Button

        boton!!.setOnClickListener(this) // recibe  un objetp

        // evento interface Text Wacher.. textChangedListener .. captura datos de donde lo asignemos
        EditName!!.addTextChangedListener(this) // con la doble admiracion se asegura que esa variable no contiene nulo, caso contrario da error
        EditAge!!.addTextChangedListener(this) // con la interrogacion dice que podra recibir un dato nulo pero no necesariamente

    }

    ///////////////////////////////funciones de Text Listener//////////////////////////////////////////////////////

    override fun afterTextChanged(s: Editable?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        //Toast.makeText(this, s.toString()+"_"+start.toString()+"_"+before.toString()+"_"+count.toString() , Toast.LENGTH_SHORT).show()
       // name = EditName?.text.toString()
       // age = EditAge?.text.toString()
//
       // if(name != "")
       // {
       //     textView_Name?.text = name// podemos obtener datos o asignar datos
       // }
       // if(age != "")
       // {
       //     textView_Age?.text = age
       // }


    }

    ////////////////////////////Evento On Click///////////////////////////////////////////
    override fun onClick(v: View?) { //con esto "v" podemos obtener los ID o elementos que estan generando el evento Onclick
        operacion()
    }
    ////////////////////funciones///////////////////////////////////////////
    private fun operacion()
    {
        name = EditName?.text.toString()
        age = EditAge?.text.toString()

        if(name != "")
        {
            textView_Name?.text = name// podemos obtener datos o asignar datos
        }
        if(age != "")
        {
            textView_Age?.text = age
        }
    }

}
