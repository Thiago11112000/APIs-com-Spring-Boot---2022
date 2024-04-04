package br.com.projeto.springbootapi2022.servico;

import br.com.projeto.springbootapi2022.modelo.mensagem.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servico {


    @Autowired
  private  Mensagem mensagem;

    
}
