package CodeGym.Level2.Lesson8.Task0216;

public class Solution {
    public static int min(int a, int b, int c) {
        //write your code here
        int firstMin = Math.min(a, b);
        return Math.min(firstMin, c);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}