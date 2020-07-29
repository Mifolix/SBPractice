package Date_27_07_2020;

import java.util.Scanner;

public class task8 {
    public static void main(String args[]) {
        int temp;
        boolean isPrime = true;
        Scanner in= new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int num = in.nextInt();
        for (int i = 2; i <= num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }
}
