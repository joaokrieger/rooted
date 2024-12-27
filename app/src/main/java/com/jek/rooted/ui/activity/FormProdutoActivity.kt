package com.jek.rooted.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.jek.rooted.R
import com.jek.rooted.model.Produto
import java.math.BigDecimal

class FormProdutoActivity : AppCompatActivity(R.layout.activity_form_produto){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val campoValor = findViewById<EditText>(R.id.valor)

            val nome = campoNome.text.toString()
            val descricao = campoDescricao.text.toString()
            val valorEmTexto = campoValor.text.toString()

            val valor = if(valorEmTexto.isBlank()){
                BigDecimal.ZERO
            }
            else{
                BigDecimal(valorEmTexto)
            }

            val produto = Produto(
                nome,
                descricao,
                valor
            )

            Log.i("FormProduto", "onCreate : $produto")
        }
    }
}