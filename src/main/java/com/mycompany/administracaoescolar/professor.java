/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracaoescolar;

/**
 *
 * @author Admin
 */
public class professor extends pessoa {//Professor sendo extendido a classe de alunos
    
    boolean Situacao; //criaçao do atributo logico
    public professor (String nome) {
        super(nome); //chamando o construtor da classe "pessoa"
}

    public boolean getSituacao() {
        return Situacao;
    }

    public void setSituacao(boolean Situacao) {
        this.Situacao = Situacao;
    }
    
    public String Servico() {
        if(this.Situacao) {
            return "INATIVO";
        }
        else{
            return "ATIVO";
}
    }
        }
