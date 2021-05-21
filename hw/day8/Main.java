package hw.day8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn bài để hiển thị");
        System.out.println("1. Bài tập mảng đa chiều");
        System.out.println("2. Bài tập mảng một chiều");

        int cas = scanner.nextInt();
        switch (cas){
            case 1 :
                int row;
                int column;
                System.out.println("Nhập vào số dòng của ma trận A: ");
                row = scanner.nextInt();
                System.out.println("Nhập vào số cột của ma trận A: ");
                column = scanner.nextInt();

                if(row!=column){
                    System.out.println("Số dòng phải bằng số cột để tạo ma trận vuông");
                    System.out.println("Hãy nhập lại số cột của ma trận: ");
                    column = scanner.nextInt();
                }

                int[][] arr = new int[row][column];
                ArrayDay8 array = new ArrayDay8();

                array.SumArray(arr, row, column);
                break;
            case 2:
                System.out.println("Bài 2");
                int length;
                System.out.println("Nhập số phần tử của mảng: ");
                length = scanner.nextInt();
                int [] array2 = new int[length];
                Array2 arrayb2 = new Array2();
                arrayb2.array2(array2, length);
                break;
            default:
                System.out.println("Chỉ có 2 bài tập thôi ^^");
        }



    }
}
