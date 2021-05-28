package hw.day10;

import java.util.Scanner;

import static java.lang.CharSequence.compare;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Ex2
        System.out.println("Bài 2: Loại bỏ chuỗi trùng");
        String input = new String();
        System.out.print("Nhập chuỗi có các ký tự trùng lặp: ");
        input = sc.nextLine();

        String result = RemoveDupChar.removeDuplicateCharacter(input);
        System.out.println("Chuỗi đã bỏ ký tự trùng lặp: "+ result);

        //Ex1:
        System.out.println("----------------------");
        System.out.println("bài 1: Kiểm tra hai chuỗi chứa nhau");
        System.out.println("Nhập chuỗi gốc: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str2 = sc.nextLine();
        CompareString.compareString(str1, str2);

    }
}
