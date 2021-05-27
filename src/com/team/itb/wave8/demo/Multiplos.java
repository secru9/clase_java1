package com.team.itb.wave8.demo;

import java.util.Scanner;

public class Multiplos {

    public static void mostrarMultiplos(int cantidadMultiplos, int n){
        int cantidad = 0;
        for (int i = 1; cantidad < cantidadMultiplos; i++) {
            if(i%n == 0){
                System.out.println(i);
                cantidad++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos multiplos se deben mostrar");
        int cantidadMultilpos = sc.nextInt();
        System.out.println("Mostrar múltiplos de ");
        int numero = sc.nextInt();
        mostrarMultiplos(cantidadMultilpos, numero);
        sc.close();
    }
}
