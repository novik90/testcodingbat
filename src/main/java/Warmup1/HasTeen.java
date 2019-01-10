package Warmup1;

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.*/

public class HasTeen {

    public static void main(String[] args) {

    }

    private static boolean hasTeen(int a, int b, int c) {
        return (a>12&&a<20)||(b>12&&b<20)||(c>12&&c<20);
    }
}
