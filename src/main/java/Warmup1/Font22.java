package Warmup1;

/*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.*/

public class Font22 {

    public static void main(String[] args) {
        System.out.println(front22("Slime"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    private static String front22(String str){
        return str.length()>2?str.substring(0, 2) + str + str.substring(0, 2):str+str+str;
    }

}
