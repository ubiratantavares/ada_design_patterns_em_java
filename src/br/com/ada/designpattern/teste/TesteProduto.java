package br.com.ada.designpattern.teste;

import br.com.ada.designpattern.model.ProdutoDigital;
import br.com.ada.designpattern.model.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoFisico.setPossuiDimensoesFisicas(true);
        produtoDigital.setPossuiDimensoesFisicas(false);


    }
}
