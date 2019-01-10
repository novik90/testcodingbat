package Warmup2;

/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;*/

public class FrontTimes {

    public static void main(String[] args) {
        System.out.println(frontTimes("Belheaven", 3));
        System.out.println(frontTimes("cat", 5));
        System.out.println(frontTimes("so", 9));
    }

    private static String frontTimes(String str, int n) {
        int frontLen = 3;
        if(frontLen>str.length())
            frontLen = str.length();

        String front = str.substring(0, frontLen);
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++){
            result.append(front);
        }
        return result.toString();
    }
}
