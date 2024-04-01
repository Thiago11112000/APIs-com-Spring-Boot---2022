package br.com.projeto.springbootapi2022.repositorio;


import br.com.projeto.springbootapi2022.modelo.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Long> {

}
