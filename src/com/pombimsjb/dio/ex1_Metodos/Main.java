package com.pombimsjb.dio.ex1_Metodos;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9,1.8);
        Calculadora.divisao(5,2.5);
        Calculadora.multiplicar(7,8);

        // Mensagem
        System.out.println("Exercício ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }
}
