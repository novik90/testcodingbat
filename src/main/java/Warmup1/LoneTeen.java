package Warmup1;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
 */

public class LoneTeen {

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
        System.out.println(loneTeen(14, 20));
        System.out.println(loneTeen(20, 15));
        System.out.println(loneTeen(16, 17));
        System.out.println(loneTeen(16, 9));
        System.out.println(loneTeen(16, 18));
        System.out.println(loneTeen(13, 19));
        System.out.println(loneTeen(13, 20));
        System.out.println(loneTeen(6, 18));
        System.out.println(loneTeen(99, 13));
        System.out.println(loneTeen(99, 99));
    }

    private static boolean loneTeen(int a, int b) {
        boolean teenA = a>=13&&a<=19;
        boolean teenB = b>=13&&b<=19;
        return !(teenA&&teenB)&&(teenA||teenB);
    }
}
