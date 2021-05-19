package hw.day5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bài 1: Tìm số nguyên tố");
        //Tìm số nguyên tố nhỏ hơn 100
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (PrimeNumber.isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" \n");

        // Tìm n số nguyên tố đầu tiên
        System.out.println("Tìm n số nguyên tố đầu tiên");
        System.out.print("Nhập n = ");

        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (count < n) {
            if (PrimeNumber.isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println(" \n");


        //Bài 2
        System.out.println("Bài 2: Tìn n số fibonacci đầu tiên");
        System.out.println("10 số đầu tiên của dãy số fibonacci: ");
        System.out.print("Nhập n: ");
        int n1 = scanner.nextInt();
        for (int j = 0; j < n1; j++) {
            System.out.print(FibonacciNumber.fibonacci(j) + " ");
        }
        System.out.println(" \n");
        System.out.println("----");

        System.out.println("Use while - n số fibonacci đầu tiên");
        int mm=1;
        int count2 = 7, num1 = 0, num2 = 1;
        while(mm<=count2)
        {
            System.out.print(FibonacciNumber.fibonacci(mm) + " ");
            mm++;
        }

        System.out.println(" \n");
        System.out.println("----");
        System.out.println("Use do - while - n số fibonacci đầu tiên");
        int ax = 1;
        do {
            System.out.print(FibonacciNumber.fibonacci(ax) + " ");
            ax ++;
        }
        while (ax < 5);
        System.out.println(" \n");
        System.out.println("----");

        System.out.println("Bài 3: Tính n giai thừa");
        System.out.print("Nhập n = ");
        int fac = scanner.nextInt();
        System.out.println("Giai thừa của " + fac + " là "  + FactorialCalculator.FactorialCalculator(fac));

        //Bài 4

        System.out.println("Random number");
        Random ran = new Random();
        int ranNum = ran.nextInt(10);
        if (PrimeNumber.isPrimeNumber(ranNum)){
            System.out.println(ranNum + " là số nguyên tố");
        }
        else System.out.println(ranNum + " không là số nguyên tố");

        System.out.println("Giai thừa của " + ranNum + " là:  " + FactorialCalculator.FactorialCalculator(ranNum));

    }
}
