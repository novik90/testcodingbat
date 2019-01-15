package Warmup1;

/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.*/

public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(9, 11));
        System.out.println(close10(10, 10));
        System.out.println(close10(58, -300));
    }

    private static int close10(int a, int b) {
        int first = Math.abs(a-10);
        int second = Math.abs(b-10);
        return first == second ? 0 : Math.min(first, second) == first ? a : b;
    }
}
