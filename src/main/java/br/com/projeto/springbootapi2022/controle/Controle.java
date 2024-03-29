package br.com.projeto.springbootapi2022.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controle {
    @GetMapping("/")
    public String mensagem() {
        return "olá mundo";
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "seja  bem  vindo(a) ";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "seja  bem  vindo(a) " + nome;
    }
}
