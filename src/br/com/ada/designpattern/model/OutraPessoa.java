// Design Pattern: Builder
package br.com.ada.designpattern.model;

import java.time.LocalDate;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutraPessoa {

    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;
}
