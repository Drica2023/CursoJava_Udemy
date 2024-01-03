package br.com.estudos.repository;

import br.com.estudos.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
   public void save(Usuario usuario){
       if(usuario.getId()==null)
           System.out.println("Save - Recebendo o usuario na camada de repositorio");
       else
           System.out.println("UPDATE - recebebdo o usuario na camada de repositorio");
          }

          public void deleteById(Integer id){
       System.out.println(String.format("DELETE / id - recebendo o id: %d para exclusao"));
       System.out.println(id);

          }

          public List<Usuario> FindAll(){
       System.out.println("LIST - Listando os usuarios do sistema");
       List<Usuario> usuarios = new ArrayList<>();
       usuarios.add(new Usuario("Adriana","Password"));
       usuarios.add(new Usuario("Gleyson", "masterpass"));
       return usuarios;

          }

          public Usuario findById(Integer id){
       System.out.println(String.format("FIND/ID - Recebebdo o id: %id para localizacao"));
       return new Usuario("Adriana", "Password");
          }

    public Usuario findByUsername(){
        System.out.println(String.format("FIND/ID - Recebebdo o id: %id para localizacao"));
        return new Usuario("Gleyson", "masterpass");
    }


}
