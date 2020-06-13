package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        return h;
    }
    public static double square2(int p, int k) {
        double h = p / (2 * (k + 1));
        double L = h * k;
        return L;
    }
    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        double result2 = SqArea.square2(6,2);
        System.out.println(" p = 6, k = 2, s = 2, h = " + result1 + " L = " + result2);
    }
}
