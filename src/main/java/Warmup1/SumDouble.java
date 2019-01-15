package Warmup1;

/*
* Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/

public class SumDouble {

    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }

    private static int sumDouble(int a, int b) {
        return (a==b)?(a+b)*2:a+b;
    }

}
