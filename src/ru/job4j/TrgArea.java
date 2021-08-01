package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double tmp = a + b + c;
        double p = tmp/2;
        double rslTmp = p * (p - a)*(p - b)*(p - c);
        return Math.sqrt(rslTmp);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}