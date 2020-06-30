package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean condition = first >= second;
        int result = condition ? first : second;
        result = result >= third ? result : third;
        return result;
    }
}
