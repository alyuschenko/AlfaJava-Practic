package com.alpha.work5;

public class main {
    public static void main(String[] args) {
        String name = "An information  system  is  designed  to  collect,  process, store and distribute information";
        int a, b;
        a = name.indexOf(' ');
        b = name.lastIndexOf(' ');
        System.out.println(name);
        String result = name.substring(b + 1) + name.substring(a, b + 1) + name.substring(0, a);
        System.out.println(result);
    }
}
