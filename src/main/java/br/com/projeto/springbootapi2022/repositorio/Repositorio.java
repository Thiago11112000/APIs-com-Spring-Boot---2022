package br.com.projeto.springbootapi2022.repositorio;


import br.com.projeto.springbootapi2022.modelo.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Long> {

     List<Pessoa> findAll();
      Pessoa findByCodigo(int codigo);

      List<Pessoa> findByOrderByNome();

      List<Pessoa>findByNomeOrderByIdadeDesc(String nome);

      List<Pessoa> findByNomeContaining(String termo);

      List<Pessoa> findByNomeStartsWith(String termo);
      List<Pessoa> findByNomeEndsWith(String termo);
@Query(value = "SELECT SUM(idade) From pessoas", nativeQuery = true)
      int somaIdades();

    @Query(value =  "SELECT  * FROM PESSOAS WHERE idade >= :idade ", nativeQuery = true)
    List<Pessoa> idadeMaiorIgual(int idade);

    int countByCodigo(int codigo);


}


