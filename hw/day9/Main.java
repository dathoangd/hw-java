package hw.day9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bài để hiển thị: ");
        System.out.println("12. Nhập a,b giải phương trình bậc nhất");
        System.out.println("13. Đếm số chia hết cho 3 từ 0 đến số đích");
        System.out.println("14. Kiểm tra số âm dương");
        System.out.println("15. Đếm số lần xuất hiện 1 ký tự trong chuỗi");
        int casee = sc.nextInt();
        switch (casee) {
            case 12: //giải phương trình bậc nhất
                System.out.println("Nhập value bậc 1: ");
                int aNumber = sc.nextInt();
                System.out.println("Nhập value bậc 2: ");
                int bNumber = sc.nextInt();
                Ex12.equation(aNumber, bNumber);
                break;
            case 13: //đếm số chia hết cho 3 từ 0 đến số nhập vào
                System.out.println("Nhập số đích: ");
                int destination = sc.nextInt();
                Ex13.count(destination);
                break;
            case 14:
                //ex14 kiểm tra số nhập vào âm hay dương
                System.out.println("Nhập số để check âm dương: ");
                int number = sc.nextInt();
                Ex14.negativePositiveNumber(number);
                break;
            case 15:
                // Ex15 Đếm số lần xuất hiện ký tự o trong chuỗi
                String str = "You only live once, but if you do it right, once is enough";
                Ex15.CountChar(str, 'o');
                break;
            default:
                System.out.println("Bài tập không tồn tại để kiểm tra");
        }
    }
}
