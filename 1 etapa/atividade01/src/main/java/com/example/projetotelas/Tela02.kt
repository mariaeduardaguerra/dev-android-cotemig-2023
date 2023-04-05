package com.example.projetotelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Tela02 : AppCompatActivity() {

    lateinit var btnTela01: Button
    lateinit var btnTela02: Button
    lateinit var btnTela03: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela02)
        btnTela01 = findViewById(R.id.btnTela01)
        btnTela01.setOnClickListener {chamaTelabtn1()}

    }

    private fun chamaTelabtn1() {

        val btnTela01 =  Intent(this@Tela02,Tela03::class.java)
        startActivity(btnTela01)
        Toast.makeText(applicationContext,"logado com sucesso!", Toast.LENGTH_SHORT).show()

    }

    private fun chamaTelabtn2() {

        val btnTela02 =  Intent(this@Tela02,Tela02::class.java)
        startActivity(btnTela02)
        Toast.makeText(applicationContext,"logado com sucesso!", Toast.LENGTH_SHORT).show()

    }

    private fun chamaTelabtn3() {

        val btnTela03 =  Intent(this@Tela02,Tela03::class.java)
        startActivity(btnTela03)
        Toast.makeText(applicationContext,"logado com sucesso!", Toast.LENGTH_SHORT).show()

    }
}