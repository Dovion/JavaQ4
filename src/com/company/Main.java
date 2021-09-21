package com.company;

public class Main {

    public static void main(String[] args) {
        var operation = 1000;
        var bonus = 100;

        if (operation > 1000) {
            var result1 = operation / bonus;
            System.out.println("Начислено бонусов: " + result1);
        } else {
            System.out.println("Для начисления бонусов операция пополнения должна быть более чем на 1000 рублей.");
        }
    }
}
