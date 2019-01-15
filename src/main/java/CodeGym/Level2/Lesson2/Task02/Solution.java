package CodeGym.Level2.Lesson2.Task02;

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    private static double convertCelsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5.0) + 32;
    }
}
