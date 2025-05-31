package com.example.appsqlite

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RespostaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereco: EditText = findViewById(R.id.edtEndereco)
        val edtBairro: EditText = findViewById(R.id.edtBairro)
        val edtCep: EditText = findViewById(R.id.edtCep)
        val edtObservacoes: EditText = findViewById(R.id.edtObservacoes)
        val edtDataCadastro: EditText = findViewById(R.id.edtDataCadastro)
        //val btnConfirmar: EditText = findViewById()



    }
}