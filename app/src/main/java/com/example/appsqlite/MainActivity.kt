package com.example.appsqlite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appsqlite.ui.theme.AppSQLiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Arquivo XML usado para o desenvolvimento da view
        setContentView(R.layout.activity_main)

        // Variáveis dos campos que serão adicionados para o salvamento de dados do usuário
        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEndereco:EditText = findViewById(R.id.edtEndereco)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val edtObservacoes:EditText = findViewById(R.id.edtObservacoes)
        val edtDataCadastro:EditText = findViewById(R.id.edtDataCadastro)

        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, RespostaActivity::class.java)
            intent.putExtra("nome", edtNome.text.toString())
            intent.putExtra("endereço", edtEndereco.text.toString())
            intent.putExtra("bairro", edtBairro.text.toString())
            intent.putExtra("cep", edtCep.text.toString())
            intent.putExtra("observações", edtObservacoes.text.toString())
            intent.putExtra("data de cadastro", edtDataCadastro.text.toString())
            startActivity(intent)
        }
    }
}