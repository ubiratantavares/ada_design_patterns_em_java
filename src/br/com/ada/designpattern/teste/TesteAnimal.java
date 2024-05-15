package br.com.ada.designpattern.teste;

import br.com.ada.designpattern.model.Animal;

public class TesteAnimal {

    public static void main(String[] args) {

        Animal animal = Animal.builder()
                .nome("Rex")
                .raca("Pastor Alemão")
                .dono("Anderson")
                .build();

        System.out.println(animal);
    }
}
