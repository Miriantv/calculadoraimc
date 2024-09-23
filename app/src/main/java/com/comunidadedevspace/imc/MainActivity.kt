package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val pesoStr : String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if(pesoStr == "" || alturaStr ==""){
                // mostrar mensagem para o usuário
                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                // Navegar para próxima tela
                // Criar o layout da próxima tela
                // Passar dados(resultado) para a próxima tela

                // Intent - Classe do próprio android

                val intent = Intent(this, ResultActivity::class.java)

                intent.putExtra( KEY_RESULT_IMC , resultado)

                startActivity(intent)

                println("Oi Mirian"+ resultado)
            }


        }

    }
}