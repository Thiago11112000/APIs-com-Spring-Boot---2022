package br.com.projeto.springbootapi2022.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controle {
    @GetMapping("/")
    public String mensagem  (){
        return "olá mundo";
    }
}
