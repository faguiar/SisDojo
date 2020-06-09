package br.com.lsat.sisdojo.entity;

import javax.persistence.*;

@Entity
public class Professor {

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    Long id;

    @Id
    private String cpf;
    private String nome;
    private String graduacao;
    private String registroNaFederacao;
    private String email;
    private String telefone1;
    private String telefone2;
    private String endereco;
    private String dataNascimento;
    private String sexo;

    public Professor() {
    }

    public Professor(String cpf, String nome, String graduacao, String registroNaFederacao, String email, String telefone1,
                     String telefone2, String endereco, String dataNascimento, String sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.graduacao = graduacao;
        this.registroNaFederacao = registroNaFederacao;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistroNaFederacao() {
        return registroNaFederacao;
    }

    public void setRegistroNaFederacao(String registroNaFederacao) {
        this.registroNaFederacao = registroNaFederacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
}
