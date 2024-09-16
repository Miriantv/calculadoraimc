package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // 1. Criar uma variável e associar(=) o componente de UI<TextInput>
        // Colocar acao no botao setOnClickListener
        // Recuperar o texto digitadp no edt peso

        val edtPeso = findViewById<TextInputEditText>(R.id.edit_text_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edit_text_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener(){

            val peso = edtPeso.text
            val altura = edtAltura.text

            println("Oi Mirian"+ peso + altura)

        }

    }
}