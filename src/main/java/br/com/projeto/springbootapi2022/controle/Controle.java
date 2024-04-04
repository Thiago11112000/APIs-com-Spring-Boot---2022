package br.com.projeto.springbootapi2022.controle;

import br.com.projeto.springbootapi2022.modelo.Pessoa;
import br.com.projeto.springbootapi2022.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
public class Controle {


    @Autowired
    private Repositorio acao;


    @PostMapping("/api")
    public  Pessoa cadastrar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    @GetMapping("/api/nomeContem")
    public  List<Pessoa> nomeContem(){
        return acao.findByNomeContaining("L");
    }

    @GetMapping("/api/ordenarNomes2")
    public List<Pessoa> OrdenarNomes2(){
       return acao.findByNomeOrderByIdadeDesc("Robson");
    }

            @GetMapping("/api")
    public List<Pessoa> selecionar(){
    return acao.findAll();
    }


    @PutMapping("/api/{codigo}")
    public Pessoa editar(@PathVariable int codigo, @RequestBody Pessoa obj) {
        Pessoa pessoaExistente = acao.findByCodigo(codigo);
        if (pessoaExistente != null) {
            pessoaExistente.setNome(obj.getNome());
            pessoaExistente.setIdade(obj.getIdade());
            return acao.save(pessoaExistente);
        } else {
            throw new RuntimeException("Pessoa não encontrada com o código: " + codigo);
        }
    }

    @DeleteMapping("/api/{codigo}")
    public void remover (@PathVariable int codigo){
        Pessoa obj = selecionarPeloCodigo(codigo);
        acao.delete(obj);
    }

    @GetMapping("api/contador")
    public long contador(){
        return acao.count();

    }

    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo){
        return acao.findByCodigo(codigo);
    }


    @GetMapping("/api/ordenarNomes")
      public List <Pessoa> ordernarPessoas  (){
     return  acao.findByOrderByNome();
    }
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


