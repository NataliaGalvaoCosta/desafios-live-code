package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        int somar = soma(3, 7);

        int dividir = divide(somar);

        int multiplicar = multiplica(dividir);

        int subtrair = subtrai(multiplicar);

        ArrayList<Integer> buscaPorResultado = new ArrayList<>();
        buscaPorResultado.add(somar);
        buscaPorResultado.add(dividir);
        buscaPorResultado.add(multiplicar);
        buscaPorResultado.add(subtrair);
        System.out.println(buscaPorResultado);
    }



    public static int soma(int a,int b) {
     int total = a+b;

        System.out.println("O resultado da soma é " + total);
        return total;
    }
    public static int divide(int soma){
        int total2 = soma/2;

        System.out.println("O resultado da divisão é " + total2);
        return total2;
    }

    public static int multiplica(int divide){
        int total3 = divide*10;

        System.out.println("O resultado da multiplicação é " + total3);
        return total3;
    }

    public static int subtrai(int multiplica){
        int total4 = multiplica-100;

        System.out.println("O resultado da subtração é " + total4);
        return total4;
    }


}