package com.jek.rooted.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jek.rooted.R
import com.jek.rooted.dao.ProdutoDao
import com.jek.rooted.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            this, produtos = ProdutoDao().buscaTodos()
        )

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}