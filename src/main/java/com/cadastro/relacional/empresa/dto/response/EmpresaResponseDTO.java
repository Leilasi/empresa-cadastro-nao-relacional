package com.cadastro.relacional.empresa.dto.response;

import com.cadastro.relacional.empresa.entity.enums.SituacaoEmpresa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


public class EmpresaResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        private String id;
        private String cnpj;
        private String razaoSocial;
        private String nomeFantasia;
        private String telefone;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date dataFundacao;
        private String email;
        private SituacaoEmpresa situacaoEmpresa;
        private EnderecoResponseDTO endereco;


    public EmpresaResponseDTO(String id, String cnpj, String razaoSocial, String nomeFantasia, String telefone, Date dataFundacao, String email, SituacaoEmpresa situacaoEmpresa, EnderecoResponseDTO endereco) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.dataFundacao = dataFundacao;
        this.email = email;
        this.situacaoEmpresa = situacaoEmpresa;
        this.endereco = endereco;
    }

    public EmpresaResponseDTO() {
    }

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

    public EnderecoResponseDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponseDTO endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "EmpresaResponseDTO{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataFundacao=" + dataFundacao +
                ", email='" + email + '\'' +
                ", situacaoEmpresa=" + situacaoEmpresa +
                ", endereco=" + endereco +
                '}';
    }
}
