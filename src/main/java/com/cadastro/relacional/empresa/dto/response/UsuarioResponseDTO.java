package com.cadastro.relacional.empresa.dto.response;

import com.cadastro.relacional.empresa.entity.enums.PerfilUsuario;

import java.io.Serializable;

public class UsuarioResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private String email;

    private PerfilUsuario perfil;

    public UsuarioResponseDTO() {
    }

    public UsuarioResponseDTO(Long id, String nome, String email, PerfilUsuario perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "UsuarioResponseDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", perfil=" + perfil +
                '}';
    }
}
