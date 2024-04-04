package br.com.projeto.springbootapi2022.repositorio;


import br.com.projeto.springbootapi2022.modelo.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Long> {

     List<Pessoa> findAll();
      Pessoa findByCodigo(int codigo);

      List<Pessoa> findByOrderByNome();

      List<Pessoa>findByNomeOrderByIdadeDesc(String nome);

}


