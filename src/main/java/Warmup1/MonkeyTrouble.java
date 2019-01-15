package Warmup1;

public class MonkeyTrouble {

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    //We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public static void main(String[] args) {
        boolean aSmile = true;
        boolean bSmile = false;

        System.out.println(monkeyTrouble(aSmile, bSmile));
    }

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return aSmile==bSmile;
    }

}