package com.example.projetotelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var login : EditText
    lateinit var senha : EditText
    lateinit var logar : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela01)
        login = findViewById(R.id.edtLogin)
        senha = findViewById(R.id.edtSenha)
        logar = findViewById(R.id.btnLogar)
        logar.setOnClickListener { chamaTela() }

    }

    private fun chamaTela() {

        var l = login.text.toString()
        var s = senha.text.toString()

        if (l.equals("aluno") && s.equals("123456")) {

            var tela = Intent(this@MainActivity,Tela02::class.java)
            startActivity(tela)
            Toast.makeText(applicationContext, "Logado com Sucesso", Toast.LENGTH_LONG).show()
            
        }
        else {
            login.setText("")
            senha.setText("")
            login.requestFocus()
        }

    }

}
