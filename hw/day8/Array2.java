package hw.day8;

import java.util.Scanner;

public class Array2 {
    void array2 (int[] array, int length){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < length; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        int count = 0;
        for (int n = 0; n < length ; n++){
           if(isPrimeNumber(array[n])){
               System.out.println(array[n] + " là số nguyên tố trong mảng.");
               sum = sum+array[n];
               count++;
            }
        }
        if (count>0){
        System.out.println("Tổng số nguyên tố trong mảng là " + sum);
        } else System.out.println("Mảng không có số nguyên tố nào cả");


    }
    public static boolean isPrimeNumber(int m1) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (m1 < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(m1);
        for (int i = 2; i <= squareRoot; i++) {
            if (m1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}

