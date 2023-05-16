package ru.netology.stats;

public class StatsService {

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (sum);
    }

    public static double midleSumArray(int[] array) {
        double sum = sumArray(array);
        double midleSum = sum / array.length;
        return (midleSum);
    }

    public static int maxSaleMonth(int[] array) {
        int maxMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public static int minSaleMonth(int[] array) {
        int minSale = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public static int lessMidleSumArray(int[] array) {
        double midleSum = midleSumArray(array);
        int lessMidleSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < midleSum) {
                lessMidleSum = lessMidleSum + 1;
            }
        }
        return (lessMidleSum);
    }

    public static int moreMidleSumArray(int[] array) {
        double midleSum = midleSumArray(array);
        int moreMidleSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > midleSum) {
                moreMidleSum = moreMidleSum + 1;
            }
        }
        return moreMidleSum;
    }

}