package Warmup1;

/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.*/

public class Diff21 {

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));
        System.out.println(diff21(30));
        System.out.println(diff21(0));
        System.out.println(diff21(1));
        System.out.println(diff21(2));
        System.out.println(diff21(-1));
        System.out.println(diff21(-2));
        System.out.println(diff21(50));
    }

    private static int diff21(int n) {
        return (n<22)?21-n:(n-21)*2;
    }

}
