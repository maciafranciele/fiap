package br.com.fiap.clientes.controller;

import br.com.fiap.clientes.model.User;
import br.com.fiap.clientes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();
    }

    @PostMapping
    public String createUser() {
        return "Retorno do metodo createUser - HTTP POST";
    }

    @PutMapping
    public String updateUser() {
        return "Retorno do metodo updateUser - HTTP PUT";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Retorno do metodo deleteUser - HTTP DELETE";
    }
}
