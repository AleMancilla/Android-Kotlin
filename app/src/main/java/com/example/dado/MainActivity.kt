package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher, View.OnClickListener,
    CompoundButton.OnCheckedChangeListener {



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

    private var rb_M : RadioButton? = null
    private var rb_F : RadioButton? = null

    private var mensaje =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditName = findViewById<EditText>(R.id.editText_nombre) // as EditText
        EditAge = findViewById<EditText>(R.id.editText_edad) //as EditText
        TextViewName = findViewById<TextView>(R.id.textView_Name) //as TextView
        TextViewAge = findViewById<TextView>(R.id.textView_Age) //as TextView

        boton = findViewById<Button>(R.id.button_ejecutar)

        rb_M = findViewById<RadioButton>(R.id.radioButton_M)
        rb_F = findViewById<RadioButton>(R.id.radioButton_F)

        //rb_M!!.setOnCheckedChangeListener(this)
        //rb_F!!.setOnCheckedChangeListener(this)
        rb_M!!.setOnClickListener(this)
        rb_F!!.setOnClickListener(this)

        boton!!.setOnClickListener(this) // recibe  un objetp

        // evento interface Text Wacher.. textChangedListener .. captura datos de donde lo asignemos
        EditName!!.addTextChangedListener(this) // con la doble admiracion se asegura que esa variable no contiene nulo, caso contrario da error
        EditAge!!.addTextChangedListener(this) // con la interrogacion dice que podra recibir un dato nulo pero no necesariamente

        //EditName!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTER

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
        name = EditName?.text.toString()
        if(name.equals("")?:(""===null))
        {
            EditName!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
        }
        else
        {
            EditName!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_NORMAL
        }
    }

    ////////////////////////////Evento On Click///////////////////////////////////////////
    override fun onClick(v: View?) { //con esto "v" podemos obtener los ID o elementos que estan generando el evento Onclick
        when(v!!.id)
        {
            R.id.button_ejecutar -> operacion()
            R.id.radioButton_M -> Toast.makeText(this,"HOMBRE",Toast.LENGTH_SHORT).show()
            R.id.radioButton_F -> Toast.makeText(this, "MUJER", Toast.LENGTH_SHORT).show()
        }

    }
    ////////////////////funciones///////////////////////////////////////////
    private fun operacion()
    {
        var valor = "Kotlin"
        when(valor) // similar a un Switch case puede ser utilizado para distintos tipos de datos
        {
            "kotlin" ->
                mensaje = valor
            "java" ->
                mensaje = valor
        }

        when // similar a un Switch case puede ser utilizado para distintos tipos de datos
        {
            1 > 0 ->
                mensaje = valor
            2 < 0 ->
                mensaje = valor
            else -> mensaje = "no es correcto"
        }
        //name = EditName?.text.toString()
        //age = EditAge?.text.toString()
//
        //if(name.equals("")?:(""===null))
        //{
        //    TextViewName!!.requestFocus()
        //}
        //else
        //{
        //    TextViewName?.text = name// podemos obtener datos o asignar datos
        //}
        //if(age.equals("")?:(""===null))
        //{
        //    TextViewAge!!.requestFocus()
        //}
        //else
        //{
        //    TextViewAge?.text = age
        //}

        //var cadena  : String = ""
        //var entero  : Int = 0
        //var doble   : Double = 0.0
        //var valor   : Boolean = true
        //var char    : Char = 'c'
        //var f       : Float = 5.0f

/////////// es igual a //////////

        //var cadena   = ""
        //var entero   = 0
        //var doble    = 0.0
        //var valor    = true
        //var char     = 'c'
        //var f        = 5.0f
        //val d        = 4 // la diferencia entre val y var es que val es inmutable.. no puede cambiar si dato... es constante var es variable
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) { //buttonView puedo obtener el id del radio buton
        //when(buttonView!!.id)
        //{
        //    R.id.radioButton_M -> if(isChecked) Toast.makeText(this,"Se ha seleccionado MASCULINO",Toast.LENGTH_SHORT).show()
        //    R.id.radioButton_F -> if(isChecked) Toast.makeText(this,"Se ha seleccionado FEMENINO",Toast.LENGTH_SHORT).show()
        //}

    }


}
