package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean condition1 = first >= second;
        int result1 = condition1 ? first : second;
        boolean condition2 = result1 >= third;
        int result = condition2 ? result1 : third;
        return result;
    }
}
