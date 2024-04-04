package br.com.projeto.springbootapi2022.modelo;

import jakarta.persistence.*;
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
    private String nome;
    private String email;


}
