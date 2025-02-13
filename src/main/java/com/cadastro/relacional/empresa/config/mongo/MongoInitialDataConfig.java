package com.cadastro.relacional.empresa.config.mongo;

import com.cadastro.relacional.empresa.entity.Empresa;
import com.cadastro.relacional.empresa.entity.Endereco;
import com.cadastro.relacional.empresa.entity.Usuario;
import com.cadastro.relacional.empresa.entity.enums.PerfilUsuario;
import com.cadastro.relacional.empresa.entity.enums.SituacaoEmpresa;
import com.cadastro.relacional.empresa.repository.EmpresaRepository;
import com.cadastro.relacional.empresa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

@Configuration
public class MongoInitialDataConfig implements CommandLineRunner {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private EmpresaRepository empresaRepository;
    
    @Override
    public void run(String... args) throws Exception {
        cadastrarUsuarioAdminDefault();
        cadastrarEmpresaDefault();

    }

    private void cadastrarEmpresaDefault() {
        final String cnpjEmpresaDefault = "18.243.873/0001-90";
        if (!empresaRepository.existsByCnpj(cnpjEmpresaDefault)) {
            Empresa empresa = new Empresa();
            empresa.setCnpj(cnpjEmpresaDefault);
            empresa.setNomeFantasia("Teste Empresarial");
            empresa.setRazaoSocial("Empresa Teste LTDA");
            empresa.setDataFundacao(Date.from(LocalDate.of(2025, Month.JANUARY, 12).atStartOfDay(ZoneId.systemDefault()).toInstant()));
            empresa.setEmail("empresa.teste@gmail.com");
            empresa.setTelefone("(25) 7048-0294");
            empresa.setSituacaoEmpresa(SituacaoEmpresa.ATIVO);

            Endereco endereco = new Endereco();
            endereco.setRua("Rua Teste");
            endereco.setNumero("88A");
            endereco.setBairro("Centro");
            endereco.setCep("12345-678");
            endereco.setComplemento("Sala 5");
            endereco.setCidade("Cidade Teste");
            endereco.setEstado("SP");

            empresa.setEndereco(endereco);
            empresaRepository.save(empresa);
        }
    }

    private void cadastrarUsuarioAdminDefault() {
        final String emailUsuarioAdminDefault = "admin@gmail.com";
        if (!usuarioRepository.existsByEmail(emailUsuarioAdminDefault)) {
            Usuario usuario = new Usuario();
            usuario.setNome("Administrador");
            usuario.setEmail(emailUsuarioAdminDefault);
            usuario.setSenha("$2a$10$zhIfqiOBXlZ/nhjORddCtuKN3k4mHk4MK1fR7Qt2cYI8iGfrtLoji");
            usuario.setPerfil(PerfilUsuario.ADMIN);
            usuarioRepository.save(usuario);
        }
    }
}
