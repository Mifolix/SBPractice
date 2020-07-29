package Date_27_07_2020;

public class task9 {
    public static void main(String args[]) {
        int temp;
        boolean isPrime = true;
        int num = 100;
        do {
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }

            }
            if (num == 3 || num == 2) {
                isPrime = true;
            }
            if (isPrime){
                System.out.print(num + " ");
            }
            num--;
        }while (num != 1);
    }
}
