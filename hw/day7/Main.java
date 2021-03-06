package hw.day7;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        ArrayB1.show(arr);

        int[] maxArr = Arrays.copyOf(arr, n);
        int max = ArrayB1.Max(maxArr);

       /* int count = 0;
        for (int i = 0; i < n; i++){
            if (max==arr[i]){
                count++;
            }
            System.out.println(ArrayB1.searchElement(arr, i));
        }
        System.out.println("Mảng có " + count + " phần tử lớn nhất");*/
        System.out.print("\nGiá trị lớn nhất của mảng là: " + max);
        System.out.print("\nVị trí của giá trị max trong mảng là: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i+1 + "\t");
            }
        }

        int[] arr2nd = Arrays.copyOf (arr, n);
        int  i, c;
        for (c = i = 0; i < n; i++) {
            if (arr2nd[i] != max) {
                arr2nd[c] = arr2nd[i];
                c++;
            }
        }

        int max2 = ArrayB1.Max(arr2nd);
        int indexOfMax2 = ArrayB1.searchElement(arr, max2);
        System.out.println("\nSecond max: " + max2);
        System.out.println("index of 2nd max: "+ indexOfMax2);

        int[] minArr = Arrays.copyOf (arr, n);
        int min = ArrayB1.min(minArr);
        int indexOfMin = ArrayB1.searchElement(arr, min);
        System.out.print("\nPhần tử nhỏ nhất của mảng là: " + min);
        System.out.print("\nVị trí của giá trị min trong mảng là: " + indexOfMin);

    }
}
