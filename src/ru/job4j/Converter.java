package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        float dollar = Converter.rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollars.");
        in = 120;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}
