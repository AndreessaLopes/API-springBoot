package br.com.colorfrieds.projeto.repository;

import br.com.colorfrieds.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario,Integer> {

}
