package Date_27_07_2020;

import java.util.Scanner;
import java.util.Random;
public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = (char) ('a' + new Random().nextInt(26));
        System.out.println("Catch the letter");
        for (char i = 0; i < 26; i++) {
            char s = sc.next().charAt(0);

            if (ch == s) {
                System.out.println("Right");
                break;
            } else {
                System.out.println("Try again");
                if (Character.getNumericValue(ch) > Character.getNumericValue(s)) {
                    System.out.println("You’re too low");
                } else if (Character.getNumericValue(ch) < Character.getNumericValue(s)) {
                    System.out.println("You’re too high");
                }
            }
        }
    }
}

