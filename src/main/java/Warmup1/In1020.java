package Warmup1;

/*Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/

public class In1020 {

    public static void main(String[] args) {
        System.out.println(in1020(12,99));
        System.out.println(in1020(21,12));
        System.out.println(in1020(8,99));
    }

    private static boolean in1020(int a, int b) {
        return (a>9&&a<21)||(b>9&&b<21);
    }

}
