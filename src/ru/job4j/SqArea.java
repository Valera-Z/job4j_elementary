package ru.job4j;

public class SqArea{
    public static double square(double p, double k){
            double tmp = k+1;
            tmp*=2;
            double h = p /tmp;
            double l = h * k;
            return l * h;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        }
}
