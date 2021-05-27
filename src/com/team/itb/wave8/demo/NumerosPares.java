package com.team.itb.wave8.demo;

import java.util.Scanner;

public class NumerosPares {

    public static void mostrarNumerosPares(int cantidadNumeros){
        int numerosPares = 0;
        System.out.println("Los primeros " + cantidadNumeros + " números pares son: ");
        for (int i = 0; numerosPares < cantidadNumeros; i ++){
            if (i%2 == 0){
                System.out.println(i);
                numerosPares ++;
            }
        }
    }

    public static void main (String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int n = sc.nextInt();
        mostrarNumerosPares(n);
        sc.close();

    }
}
