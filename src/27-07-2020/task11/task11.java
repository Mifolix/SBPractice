package task11;

import java.util.Scanner;

public class task11 {
    public static void main(String args[]) {
        int a = 0;
        int b = 100;
        int randomNumber = a + (int) (Math.random() * b);
        System.out.println("Случайное число: " + randomNumber);
    }
}
