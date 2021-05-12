package hw.day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bài 1 - Hiển thị ngày trong tháng

        System.out.println("------Bài 1------");
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tháng: ");
        month = scanner.nextInt();
        CalculatorDayOfMonth dom = new CalculatorDayOfMonth();
        dom.Month(month);

        // Bài 2: Phương trình bậc 2
        System.out.println("------Bài 2----------");
        System.out.println("Phương trình: ax2 + bx + c = 0");
        float a, b, c;
        System.out.print("Nhập hệ số bậc 2, a = ");
        a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        c = scanner.nextFloat();

        giaiPTBac2 ptb2 = new giaiPTBac2();
        ptb2.giaiPTBac2(a,b,c);

        //Bài 3: Tính cạnh tam giác:
        System.out.println("----- Bài 3 ----------");
        double x1, x2, x3;
        System.out.println("Nhập 3 độ dài 3 cạnh: ");
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        x3 = scanner.nextDouble();

        CanhTamGiac tamgiac = new CanhTamGiac();
        tamgiac.TinhCanhTamGiac(x1, x2, x3);

    }
}

