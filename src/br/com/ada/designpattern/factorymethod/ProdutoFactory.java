package br.com.ada.designpattern.factorymethod;

import br.com.ada.designpattern.model.Produto;
import br.com.ada.designpattern.model.ProdutoDigital;
import br.com.ada.designpattern.model.ProdutoFisico;
import br.com.ada.designpattern.model.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo de produto não disponível.");
        }
    }
}
