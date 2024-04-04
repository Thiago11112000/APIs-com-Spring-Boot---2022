package br.com.projeto.springbootapi2022.modelo.mensagem;


import org.springframework.stereotype.Component;

@Component
public class Mensagem {


  private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
