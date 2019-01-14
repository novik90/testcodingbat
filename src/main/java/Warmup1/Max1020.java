package Warmup1;

/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.*/

public class Max1020 {

    public static void main(String[] args) {
        System.out.println(max1020(11, 19)); // 19
        System.out.println(max1020(19, 11)); // 19
        System.out.println(max1020(11, 9)); // 11
        System.out.println(max1020(9, 21)); // 0
    }

    private static int max1020(int a, int b) {

        int aMax = 0;
        int bMax = 0;

        if (a>=10&&a<=20)
            aMax = a;
        if (b>=10&&b<=20)
            bMax = b;

        return Math.max(aMax, bMax);

    }

}
