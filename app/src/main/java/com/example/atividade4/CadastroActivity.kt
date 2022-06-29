package com.example.atividade4

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.toolbar))
        setTitle("Compras")
        val botaoSalvar = findViewById<Button>(R.id.bntSalvar)
        botaoSalvar.setOnClickListener{
            finish()
    }
}