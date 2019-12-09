package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var EditName : EditText? = null // en Kotlin no se permiten objetos nulos por lo que lo forzamos con esta linea
    // en kotlin no es necesario utilizar punto y coma
    private var EditAge : EditText? = null
    private var name : String? = null
    private var age = 0
    // en kotlin no es necesario que deblare el tipo de variable... basta con ponerle el dato y kotlin interpretara que tipo de dato es
    // la unica diferencia es que se pone = para poner el dato , caso contrario se pone :

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditName = findViewById(R.id.editText_edad) as EditText
        EditAge = findViewById(R.id.editText_edad) as EditText

    }
}
