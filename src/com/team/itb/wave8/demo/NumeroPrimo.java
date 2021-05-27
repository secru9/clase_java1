package com.team.itb.wave8.demo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void esPrimo(int n){
        boolean primo = true;
        for (int i = 2; i < n/2; i++){
            if (n%i == 0){
                primo = false;
            }
        }

        if (primo){
            System.out.println("Es primo");
        } else{
            System.out.println("No es primo");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int n = sc.nextInt();
        esPrimo(n);
        sc.close();
    }
}
