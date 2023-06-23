package br.com.colorfrieds.projeto.service;

import br.com.colorfrieds.projeto.model.Usuario;
import br.com.colorfrieds.projeto.repository.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private IUsuario repository;

    public UsuarioService(IUsuario repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario(){
        List<Usuario> lista = repository.findAll();
        return lista;
    }

    public Usuario criarUsuario(Usuario usuario){
        Usuario usuarionovo = repository.save(usuario);
        return usuarionovo;
    }

    public Usuario editarUsuario(Usuario usuario){
        Usuario usuarionovo = repository.save(usuario);
        return usuarionovo;
    }

    public boolean excluirUsuario(Integer id){
        repository.deleteById(id);
        return true;
    }

}
