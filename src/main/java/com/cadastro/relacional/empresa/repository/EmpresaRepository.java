package com.cadastro.relacional.empresa.repository;

import com.cadastro.relacional.empresa.entity.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmpresaRepository extends MongoRepository<Empresa, String> {

    Optional<Empresa> findByCnpj(String cnpj);
    Page<Empresa> findByNomeFantasiaOrEnderecoCidade(String nomeFantasia, String cidade, Pageable pageable);
    void deleteByCnpj(String cnpj);
    boolean existsByCnpj(String cnpj);


}
