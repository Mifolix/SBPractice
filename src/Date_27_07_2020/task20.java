package Date_27_07_2020;

import java.util.ArrayList;
import java.util.Scanner;

public class task20{

    public static class Foo{
        int[] arr;
        float avg;
        String surname;
        Foo(String name,int[] arr){
            this.surname = name;
            this.arr = arr;

            int sum = 0;
            for (int i = 0; i < arr.length; ++i)
                sum +=arr[i];
            this.avg = sum/arr.length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rand = (int) (Math.random() * (5 - 1) + 1);
        ArrayList<Foo> people = new ArrayList<Foo>();
        for(int i = 0; i < n; ++i) {
            int[] temp = new int[rand];
            System.out.println("Введите имя");
            String name = scanner.next();
            System.out.println("Введите " + rand + " чисел(а)");
            for(int j = 0; j < rand; ++j)
                temp[j] = scanner.nextInt();
            people.add(new Foo(name,temp));
        }


        for (Foo person : people) {
            System.out.println(person.surname+ " " + person.avg);
        }
    }
}

