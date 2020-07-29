package Date_27_07_2020;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        a = in.nextInt();
        System.out.print("Делителями числа " + a + " являются: ");
        for(int i = a; i > 0; i--){
            int b = a % i;
            if(b == 0)
                System.out.print(i + " ");
        }
    }
}
