package br.com.ada.designpattern.model;

import java.math.BigDecimal;

public class ProdutoDigital extends Produto {

    public ProdutoDigital() {
    }

    public ProdutoDigital(String descricao, BigDecimal preco, boolean possuiDimensoesFisicas) {
        super(descricao, preco, possuiDimensoesFisicas);
    }
}
