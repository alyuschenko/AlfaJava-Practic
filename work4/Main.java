package com.alpha.work4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите знасение: ");
        int num = scan.nextInt();
        String rezult="Другое";
        if (num == 1) rezult = "Один";
        else if (num == 2) rezult = "Два";
        else if (num == 3) rezult = "Три";
        else if (num == 4) rezult = "Четыре";
        else if (num == 5) rezult = "Пять";
        else if (num == 6) rezult = "Шесть";
        else if (num == 7) rezult = "Семь";
        else if (num == 8) rezult = "Восемь";
        else if (num == 9) rezult = "Девять";
        System.out.println("Результат (if-else’if): "+rezult);

        switch (num){
            case 1: rezult = "Один";
                break;
            case 2: rezult = "Два";
                break;
            case 3: rezult = "Три";
                break;
            case 4: rezult = "Четыре";
                break;
            case 5: rezult = "Пять";
                break;
            case 6: rezult = "Шесть";
                break;
            case 7: rezult = "Семь";
                break;
            case 8: rezult = "Восемь";
                break;
            case 9: rezult = "Девять";
                break;
            default: rezult = "Другое";
        }
        System.out.println("Результат (switch): "+rezult);
    }
}
