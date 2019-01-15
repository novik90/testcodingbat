package CodeGym.Level2.Lesson8.Task0217;

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        return min(min(a, b), min(c, d));
    }

    public static int min(int a, int b) {
        //write your code here
        return Math.min(a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}