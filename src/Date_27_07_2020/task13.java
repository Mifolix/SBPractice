package Date_27_07_2020;

import java.util.Random;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int n,num=0,h;
        System.out.println("Введите размер массива: ");
        n=in.nextInt();
        double[] myArray;
        myArray = new double[n];
        for (int i=0;i<n;i++)
        {
            myArray[i]=(int) rand.nextInt(50);
        }
        while(num!=3) {
            System.out.println("1 - Вывести массив;");
            System.out.println("2 - Увеличить элемент массива на 10%;");
            System.out.println("3 - Выход");
            num = in.nextInt();
            switch (num) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.print(myArray[i] + " ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Выберите элемент массива размером " + n + " :");
                    h = in.nextInt();
                    myArray[h] =myArray[h] + myArray[h] * 0.1;
                    break;
                case 3:
                    break;
            }
        }
    }
}
