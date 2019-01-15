package Warmup1;

/*Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.*/

public class NearHundred {

    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(110));
        System.out.println(nearHundred(111));
        System.out.println(nearHundred(-101));
        System.out.println(nearHundred(203));
    }

    private static boolean nearHundred(int  n) {
        return ((Math.abs(100-n)<=10)||(Math.abs(200-n)<=10));
    }

}
