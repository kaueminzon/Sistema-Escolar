/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracaoescolar;

/**
 *
 * @author Admin
 */
public class AdmEscolar { //abstração
    public static void main(String args[]) {
        pessoa pessoa1 = new pessoa("Kaue Minzon"); //criação da instancia
        pessoa pessoa2 = new pessoa("Bruna Pedroso"); //Nome exigido pelo construtor
        pessoa pessoa3 = new pessoa("Italo Aragão");
        pessoa pessoa4 = new pessoa("Lais Martins");
        pessoa pessoa5 = new pessoa("Matheus Porto");
        
        professor professor1 = new professor("Wagner");
        professor professor2 = new professor("Ediney");
        professor professor3 = new professor("Cleber");
        
        //determinando quais professores estao INATIVOS
        professor3.setSituacao(true);
        
        pessoa1.CPF = "48989465401";  //atrubuto da instancia
        pessoa2.CPF = "34749012111";
        pessoa3.CPF = "36832587563";
        pessoa4.CPF = "56598423488";
        pessoa5.CPF = "84848812654";
        
        pessoa1.idade = "17";
        pessoa2.idade = "19";
        pessoa3.idade = "27";
        pessoa4.idade = "18";
        pessoa5.idade = "20";
        
        System.out.println("Nome da Pessoa: = " +pessoa1.Nome); 
        System.out.println("Nome da Pessoa: = " +pessoa2.Nome);
        System.out.println("Nome da Pessoa: = " +pessoa3.Nome);
        System.out.println("Nome da Pessoa: = " +pessoa4.Nome);
        System.out.println("Nome da Pessoa: = " +pessoa4.Nome+"\n");
        
        System.out.println("N° do CPF Pessoa 1: = " +pessoa1.CPF);
        System.out.println("N° do CPF Pessoa 2: = " +pessoa2.CPF);
        System.out.println("N° do CPF Pessoa 3: = " +pessoa3.CPF);
        System.out.println("N° do CPF Pessoa 4: = " +pessoa4.CPF);
        System.out.println("N° do CPF Pessoa 5: = " +pessoa5.CPF +"\n");
        
        System.out.println("Idade da Pessoa 1 = " +pessoa1.idade);
        System.out.println("Idade da Pessoa 2 = " +pessoa2.idade);
        System.out.println("Idade da Pessoa 3 = " +pessoa3.idade);
        System.out.println("Idade da Pessoa 4 = " +pessoa4.idade);
        System.out.println("Idade da Pessoa 5 = " +pessoa5.idade +"\n");
        
        System.out.println("Situação do Professor " +professor1.Nome + ": " +professor1.Servico());
        System.out.println("Situação do Professor " +professor2.Nome + ": " +professor2.Servico());
        System.out.println("Situação do Professor " +professor3.Nome + ": " +professor3.Servico());

      }
    }
