package Warmup1;

/*Given three int values, a b c, return the largest.*/

public class IntMax {

    public static void main(String[] args) {
        System.out.println(intMax(1,2,3));
        System.out.println(intMax(1,3,2));
        System.out.println(intMax(3,2,1));
        System.out.println(intMax(5,2,6));
    }

    private static int intMax(int a, int b, int c) {
        int preResult = Math.max(a, b);
        return Math.max(preResult, c);
    }
}
