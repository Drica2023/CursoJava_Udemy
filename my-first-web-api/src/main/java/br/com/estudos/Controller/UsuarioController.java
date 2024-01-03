package br.com.estudos.Controller;

import br.com.estudos.model.Usuario;
import br.com.estudos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UsuarioController {
    @Autowired
         private UsuarioRepository repository;
        @GetMapping("/users")
        public List<Usuario> getUsers(){
            return repository.FindAll();
        }




}

