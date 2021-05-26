package hw.day9;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bài để hiển thị: ");
        System.out.println("9. Hw9 - In ra tam giác sao");
        System.out.println("10. Hw10 - In ra hình chữ nhật sao");
        System.out.println("11. Phân tích số nguyên thành tích các số nguyên tố");
        System.out.println("12. Nhập a,b giải phương trình bậc nhất");
        System.out.println("13. Đếm số chia hết cho 3 từ 0 đến số đích");
        System.out.println("14. Kiểm tra số âm dương");
        System.out.println("15. Đếm số lần xuất hiện 1 ký tự trong chuỗi");
        int cases = sc.nextInt();

        switch (cases) {
            case 9:
                int height;
                Scanner scanner = new Scanner(System.in);
                do {
                    System.out.println("Nhập vào chiều cao của hình tam giác: ");
                    height = scanner.nextInt();
                    if (height <= 1) {
                        System.out.println("Chiêu cao tam giác bắt đầu từ 2, hãy nhập lại!");
                    }
                } while (1 >= height);
                System.out.println("Hình tam giác * ");
                hwEx9.printTriangleStar(height);
                break;
            case 10:
                int height2, width;
                do {
                    System.out.println("Nhập chiều cao của hình chữ nhật: ");
                    height2 = sc.nextInt();
                    if (height2 <= 0) {
                        System.out.println("Chiều cao > 0, hãy nhập lại!!!");
                    }

                } while (height2 <= 0);
                do {
                    System.out.println("Nhập chiều rộng của hình chữ nhật: ");
                    width = sc.nextInt();
                    if (width <= 0) {
                        System.out.println("Chiều rộng > 0, hãy nhập lại!!!");
                    }
                }
                while (width<=0);
                hwEx10.printRectangleStar(height2, width);

                break;
            case 11:
                System.out.println("Nhập só nguyên cần phân tích: ");
                int positiveNumber = sc.nextInt();
                List<Integer> listNumbers = Ex11.positiveInt(positiveNumber);
                System.out.printf("Kết quả: %d = ", positiveNumber);
                int size = listNumbers.size();
                for (int i = 0; i < size - 1; i++) {
                    System.out.print(listNumbers.get(i) + " x ");
                }
                System.out.print(listNumbers.get(size - 1));
                break;

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
