package br.com.ada.designpattern.model;

import java.math.BigDecimal;

public class ProdutoFisico extends Produto {

    public ProdutoFisico() {
    }

    public ProdutoFisico(String descricao, BigDecimal preco, boolean possuiDimensoesFisicas) {
        super(descricao, preco, possuiDimensoesFisicas);
    }
}
