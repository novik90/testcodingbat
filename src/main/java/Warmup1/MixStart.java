package Warmup1;

/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.*/

public class MixStart {

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    private static boolean mixStart(String str) {
        return str.length()>2&&str.substring(1, 3).equals("ix");
    }
}
