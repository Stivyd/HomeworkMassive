package ru.netology.stats;


public class Main {
    public static void main(String[] args) {
        int[] array = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел массива равна " + sum);
    }
}