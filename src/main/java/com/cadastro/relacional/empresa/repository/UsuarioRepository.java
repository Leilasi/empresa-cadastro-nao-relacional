package com.cadastro.relacional.empresa.repository;

import com.cadastro.relacional.empresa.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);

}
