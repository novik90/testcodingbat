package Warmup2;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.*/

public class StringTimes {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Hello", 4));
        System.out.println(stringTimes("Code", 7));
        System.out.println(stringTimes("x", 4));
    }

    private static String stringTimes(String str, int n) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i<n; i++) {
            temp.append(str);
        }
        return temp.toString();
    }

}
