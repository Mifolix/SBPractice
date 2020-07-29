package Date_27_07_2020;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int result = 0;
        do{
            result += num % 10;
            num /= 10;
        }while (num > 9);
        result += num;
        System.out.print("Сумма чисел числа: " + result);
    }
}
