package com.alpha.work3;

public class Main {
    public static void main(String[] args) {
        double dep = 100000;
        int proc = 12;
        int mm = 5;
        double result_year = dep * proc / 100;
        //System.out.println(result_year);
        double result_dep = result_year / 12 * mm;
        System.out.println("Начисленные % = " + result_dep);
        double all = result_dep + dep;
        System.out.println("Вся сумма с % = " + all);
    }
}