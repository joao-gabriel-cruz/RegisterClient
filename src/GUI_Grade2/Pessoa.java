/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Grade2;

/**
 *
 * @author ckenn
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;

    public String pegarNome() {
        return nome;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public String pegarTelefone() {
        return telefone;
    }

    public void atualizarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String pegarEmail() {
        return email;
    }

    public void atualizarEmail(String email) {
        this.email = email;
    }

    public String pegarLogradouro() {
        return logradouro;
    }

    public void atualizarLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String pegarNumero() {
        return numero;
    }

    public void atualizarNumero(String numero) {
        this.numero = numero;
    }

    public String pegarComplemento() {
        return complemento;
    }

    public void atualizarComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String pegarBairro() {
        return bairro;
    }

    public void atualizarBairro(String bairro) {
        this.bairro = bairro;
    }

    public String pegarCidade() {
        return cidade;
    }

    public void atualizarCidade(String cidade) {
        this.cidade = cidade;
    }

    public String pegarEstado() {
        return estado;
    }

    public void atualizarEstado(String estado) {
        this.estado = estado;
    }

    public String pegarCEP() {
        return CEP;
    }

    public void atualizarCEP(String CEP) {
        this.CEP = CEP;
    }
    
}
