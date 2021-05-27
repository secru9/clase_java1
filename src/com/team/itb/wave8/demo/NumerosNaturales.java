package com.team.itb.wave8.demo;

import java.util.Scanner;

public class NumerosNaturales {

    public static void calcular(int cantidadNumeros, int numeroDiguitos, int numRepetido){
        int contador = 0;
        int i = 1;
        while (contador < cantidadNumeros){

            String num = Integer.toString(i);
            char[] ch = num.toCharArray();

            int contadorRepeticiones = 0;
            for (char c: ch) {
                if (Character.getNumericValue(c) == numRepetido){
                    contadorRepeticiones ++;
                }
            }

            if (contadorRepeticiones == numeroDiguitos){
                System.out.println(i);
                contador++;
            }
            i ++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Números naturales a mostrar");
        int cantidadNumeros = sc.nextInt();
        System.out.println("Número de diguitos");
        int numeroDiguitos = sc.nextInt();
        System.out.println("Número a repetir");
        int numRepetido = sc.nextInt();
        calcular(cantidadNumeros, numeroDiguitos, numRepetido);
        sc.close();
    }
}
