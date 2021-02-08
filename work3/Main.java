package com.alpha.work3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Сума депозита : ");
        double dep = scan.nextDouble();
        System.out.println("Срок в месяцах : ");
        int mm= scan.nextInt();
        int proc = 12;
        double result =(dep*proc*mm/12)/100;
        System.out.println("Начисленые проценты: " + result);
    }
}