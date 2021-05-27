package com.team.itb.wave8.demo;

import java.util.Scanner;

public class CantidadPrimos {
    public static void mostrarPrimos(int cantidad){
        int c = 0;
        for (int i = 1; c < cantidad; i++){
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0){
                    contador ++;
                }
            }

            if (contador == 2) {
                System.out.println(i);
                c++;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos números primos se deben mostrar");
        int cantidadPrimos = sc.nextInt();
        mostrarPrimos(cantidadPrimos);
        sc.close();
    }
}
