package com.example.marcos.cadastrocliente;

import java.io.Serializable;

/**
 * Created by Marcos on 04/05/2015.
 */
public class Pessoa implements Serializable {
     private String pNome, pTelefone, pEndereco, pBairro, pCidade, pEstado;

    public void Pessoa(){

    }

    public void Pessoa(String nome, String telefone, String endereco, String bairro, String cidade, String estado){
        pNome = nome;
        pTelefone = telefone;
        pEndereco = endereco;
        pBairro = bairro;
        pCidade = cidade;
        pEstado = estado;
    }

    public String getpNome() {
        return pNome;
    }

    public void setpNome(String pNome) {
        this.pNome = pNome;
    }

    public String getpTelefone() {
        return pTelefone;
    }

    public void setpTelefone(String pTelefone) {
        this.pTelefone = pTelefone;
    }

    public String getpEndereco() {
        return pEndereco;
    }

    public void setpEndereco(String pEndereco) {
        this.pEndereco = pEndereco;
    }

    public String getpBairro() {
        return pBairro;
    }

    public void setpBairro(String pBairro) {
        this.pBairro = pBairro;
    }

    public String getpCidade() {
        return pCidade;
    }

    public void setpCidade(String pCidade) {
        this.pCidade = pCidade;
    }

    public String getpEstado() {
        return pEstado;
    }

    public void setpEstado(String pEstado) {
        this.pEstado = pEstado;
    }
}
