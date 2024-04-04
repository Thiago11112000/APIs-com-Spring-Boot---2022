package br.com.projeto.springbootapi2022.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "clientes")
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
@NotEmpty(message = "Informe um nome")
    private String nome;
@NotEmpty(message = "O campo email é obrigatório")
@Email(message =  "Informe um email válido")
    private String email;


}
