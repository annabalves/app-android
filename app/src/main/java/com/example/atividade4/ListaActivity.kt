package com.example.atividade4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        setTitle("Passagens")
        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener{
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
    }
}