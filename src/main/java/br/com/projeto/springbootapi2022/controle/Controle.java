package br.com.projeto.springbootapi2022.controle;

import br.com.projeto.springbootapi2022.modelo.Cliente;
import br.com.projeto.springbootapi2022.modelo.Pessoa;
import br.com.projeto.springbootapi2022.repositorio.Repositorio;
import br.com.projeto.springbootapi2022.servico.Servico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
public class Controle {


    @Autowired
    private  Repositorio acao;

    @Autowired
    private Servico servico;


    @PostMapping("/api")
    public  ResponseEntity<?> cadastrar(@RequestBody Pessoa obj){
        return  servico.cadastrar(obj);
    }


    @GetMapping("/api/iniciaCom")
    public List<Pessoa>  iniciaCom(){
      return acao.findByNomeStartsWith("a");
    }
    @GetMapping("/api/terminaCom")
    public List<Pessoa> terminaCom(){
     return acao.findByNomeEndsWith("o");
    }
@GetMapping("/api/somaIdades")
 public  int somaIdades(){
        return acao.somaIdades();
}
@GetMapping("/api/idadeMaiorIgual")
public List<Pessoa> idadeMaiorIgual(){
        return acao.idadeMaiorIgual(25);
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
    public   ResponseEntity<?> selecionar(){
    return servico.selecionar();
    }


    @PutMapping("/api")
    public ResponseEntity<?> editar(@RequestBody Pessoa obj) {
       return servico.editar(obj);

        }


    @DeleteMapping("/api/{codigo}")
    public ResponseEntity<?> remover (@PathVariable int codigo) {
        return servico.remover(codigo);
    }

    @GetMapping("api/contador")
    public long contador(){
        return acao.count();
    }

    @GetMapping("/api/{codigo}")
    public ResponseEntity<?> selecionarPeloCodigo(@PathVariable int codigo){
        return servico.selecionarPeloCodigo(codigo);
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


    @GetMapping("/status")
     public ResponseEntity<?> status(){
     return new  ResponseEntity <>(HttpStatus.CREATED);
    }


    @PostMapping("/cliente")
        public void cliente(@Valid @RequestBody Cliente obj ){

    }


    }





