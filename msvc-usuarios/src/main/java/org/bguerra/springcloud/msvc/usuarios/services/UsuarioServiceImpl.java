package org.bguerra.springcloud.msvc.usuarios.services;

import org.bguerra.springcloud.msvc.usuarios.models.entity.Usuario;
import org.bguerra.springcloud.msvc.usuarios.repositories.UsuarioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRespository respository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return (List<Usuario>) respository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> porId(Long id) {
        return respository.findById(id);
    }

    @Override
    @Transactional
    public Usuario guardar(Usuario usuario) {
        return respository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
    respository.deleteById(id);
    }
}
