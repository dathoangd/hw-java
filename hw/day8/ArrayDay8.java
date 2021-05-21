package hw.day8;

import java.util.Scanner;

public class ArrayDay8 {
    int SumArray (int[][] array, int row, int column){
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < row; i++){
                for (int j=0; j<column; j++){
                    System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                    array[i][j] = sc.nextInt();
                }
            }
        System.out.println("Mảng vừa nhập : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int sum =0;

        System.out.println("Phần tử trên đường chéo chính của ma trận là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(i==j){
                    System.out.print(array[i][j] + "\t");
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Tổng phần tử trên đường chéo là: " + sum);
       int sum2 =0;
       if(row>=1) {
           for (int i = 0; i < column; i++) {
               sum2 = sum2 + array[1][i];
           }
           System.out.println("Tổng các value ở cột 2 là: " + sum2);
       }
       else System.out.println("Mảng không có value ở cột số 2");







        return 1;
    }
}
