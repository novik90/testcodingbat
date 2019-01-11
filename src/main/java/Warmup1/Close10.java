package Warmup1;

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
