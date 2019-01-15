package CodeGym.Level2.Lesson8.Task0215;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        // write your code here
        return (earthWeight / 100.0) * 17;
    }
}