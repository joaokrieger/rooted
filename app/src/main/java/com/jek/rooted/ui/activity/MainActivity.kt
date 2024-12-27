package com.jek.rooted.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.jek.rooted.R
import com.jek.rooted.model.Produto
import com.jek.rooted.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            this, produtos = listOf(
                Produto("Produto 1", "Descrição", valor = BigDecimal("19.99")),
                Produto("Produto 2", "Descrição", valor = BigDecimal("20.99")),
                Produto("Produto 3", "Descrição", valor = BigDecimal("90.99")),
                Produto("Produto 4", "Descrição", valor = BigDecimal("100.99")),
            )
        )
    }
}