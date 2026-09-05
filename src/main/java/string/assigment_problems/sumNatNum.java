import java.util.Scanner;

public class sumNatnum {
    static void sumOfNaturalNumbers(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sumOfNaturalNumbers(n);
        sc.close();
    }
}