package br.com.ada.designpattern.teste;

import br.com.ada.designpattern.builder.PessoaBuilder;
import br.com.ada.designpattern.model.Pessoa;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {

        /*
        Pessoa pessoa = new Pessoa("Anderson",
                "Piotto",
                "09876554323",
                "piottok10@gmail.com",
                "careca",
                LocalDate.of(1985, 3, 12));

        System.out.println(pessoa);

         */

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Anderson")
                .sobreNome("Piotto")
                .documento("09876554323")
                .email("piottok10@gmail.com")
                .apelido("careca")
                .dataNascimento(LocalDate.of(1985, 3, 12))
                .build();

        System.out.println(pessoa);


    }
}
