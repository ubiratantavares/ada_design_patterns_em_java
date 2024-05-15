package br.com.ada.designpattern.teste;

import br.com.ada.designpattern.model.OutraPessoa;

import java.time.LocalDate;

public class TesteOutraPessoa {
    public static void main(String[] args) {

        OutraPessoa op = OutraPessoa.builder()
                .nome("João")
                .sobreNome("Maria")
                .apelido("Bob")
                .documento("123456789")
                .email("bob@gmail.com")
                .dataNascimento(LocalDate.of(1973, 2, 15))
                .build();

        System.out.println(op);
    }
}
