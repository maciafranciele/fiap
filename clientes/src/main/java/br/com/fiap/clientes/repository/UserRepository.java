package br.com.fiap.clientes.repository;

import br.com.fiap.clientes.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

}
