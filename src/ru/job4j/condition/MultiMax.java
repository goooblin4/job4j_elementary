package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean condition1 = first >= second;
        int result = condition1 ? first : second;
        boolean condition2 = result >= third;
        result = condition2 ? result : third;
        return result;
    }
}
