package com.jek.rooted.dao

import com.jek.rooted.model.Produto

class ProdutoDao {

    fun adiciona(produto : Produto){
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}