package com.cadastro.relacional.empresa.entity;

import com.cadastro.relacional.empresa.entity.enums.SituacaoEmpresa;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

@Document
public class Empresa {

    @Id
    private String id;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String telefone;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dataFundacao;
    private String email;
    private SituacaoEmpresa situacaoEmpresa;
    private Endereco endereco;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SituacaoEmpresa getSituacaoEmpresa() {
        return situacaoEmpresa;
    }

    public void setSituacaoEmpresa(SituacaoEmpresa situacaoEmpresa) {
        this.situacaoEmpresa = situacaoEmpresa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(id, empresa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
