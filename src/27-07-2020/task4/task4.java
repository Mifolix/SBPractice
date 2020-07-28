package task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String src = Integer.toString(in.nextInt());
        src = src.replaceAll("[\\s]", "").toLowerCase();
        boolean result = true;
        for (int i = 0; i < src.length() / 2; i++) {
            if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
    }
}
