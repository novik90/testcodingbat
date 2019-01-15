package Warmup2;

/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".*/

public class DoubleX {

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("xxxxxx"));
    }

    private static boolean doubleX(String str) {
        int i = str.indexOf("x");
        String x = str.substring(i);
        return x.startsWith("xx");
    }
}
