package Date_27_07_2020;

import java.util.Scanner;

public class task10 {
    public static int fib(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fib(i - 1) + fib(i - 2);
    }
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
