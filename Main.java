package com.learncode;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
           private static DecimalFormat df2 = new DecimalFormat(".00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Suma este: ");
        System.out.println(a + b);
        System.out.println("Diferenta este:");
        System.out.println(a - b);
        System.out.println("Produsul este:");
        System.out.println(a*b);
        System.out.println("Media este:");
        double x = (double) (a+b)/2;
        System.out.println(df2.format(x));
        System.out.println("Distanta dintre cele 2 numere este");
        System.out.println(Math.sqrt(Math.pow((a -b ),2)));
        System.out.println("Maximul este: ");
        System.out.println(Math.max(a, b));
    }

}




