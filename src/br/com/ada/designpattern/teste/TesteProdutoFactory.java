package br.com.ada.designpattern.teste;

import br.com.ada.designpattern.model.Produto;
import br.com.ada.designpattern.factorymethod.ProdutoFactory;
import br.com.ada.designpattern.model.TipoProdutoEnum;

public class TesteProdutoFactory {

    public static void main(String[] args) {

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);

        System.out.println(produtoFisico);
    }
}
