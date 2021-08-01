package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int xDifference = x2 - x1;
        int yDifference = y2 - y1;
        double sumOfPwr = Math.pow(xDifference, 2) + Math.pow(yDifference, 2);
        double rsl = Math.sqrt(sumOfPwr);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
