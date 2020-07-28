package task12;

import java.util.Scanner;

public class task12 {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите строку и число: ");
        String str = in.nextLine();
        int num = Integer.parseInt (str.trim().split(" ")[1]);
        str = str.substring(0, str.indexOf(" "));
        str = str.substring(0, num) + str.substring(num + 1);
        System.out.println(str);
    }
}
