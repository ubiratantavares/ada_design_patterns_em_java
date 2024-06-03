package br.com.ada.designpattern.model;

//import br.com.ada.designpattern.builder.PessoaBuilder;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {
    private String nome;
    private String dono;
    private String raca;
}
