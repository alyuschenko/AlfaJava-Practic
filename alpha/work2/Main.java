package com.alpha.work2;

/*
-описывает трехзначное целое число number = 123;
−находит и выводит на консоль разность между числом  numberи числом,
составленным из цифр числа number,
но взятых в обратном порядке (для данного задания обратное число – это 321).
 */



public class Main {
    public static void main(String[] args) {
        double dep = 100000.5;
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
