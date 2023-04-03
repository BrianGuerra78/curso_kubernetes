package org.bguerra.springcloud.msvc.usuarios.repositories;

import org.bguerra.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRespository extends CrudRepository<Usuario, Long> {

}
