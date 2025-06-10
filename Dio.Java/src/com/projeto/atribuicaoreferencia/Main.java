package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int A = 1;
        int B = A;

        System.out.println("A = "+ A + " B = "+ B);
        int A = 2;
        System.out.println("A = "+ A + " B = "+ B);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("A = "+ objA + " B = "+ objB);
    }
}