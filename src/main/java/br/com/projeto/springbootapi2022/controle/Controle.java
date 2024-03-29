package br.com.projeto.springbootapi2022.controle;

import br.com.projeto.springbootapi2022.modelo.Pessoa;
import org.springframework.web.bind.annotation.*;


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
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
     return p;
    }

}
