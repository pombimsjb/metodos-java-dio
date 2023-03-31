package com.pombimsjb.dio.ex3_Retornos;

import com.pombimsjb.dio.ex2_Sobrecarga.Quadrilatero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício quadrilátero");

        double areaQuadrado = QuadrilateroComReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);
        double areaRetangulo = QuadrilateroComReturn.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);
        double areaTrapezio = QuadrilateroComReturn.area(7,8,9);
        System.out.println("Área do Trapézio: " + areaTrapezio);

    }
}
