package hw.day4;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {

        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tháng: ");
        month = scanner.nextInt();
        CalculatorDayOfMonth dom = new CalculatorDayOfMonth();

        dom.Month(month);
    }
}

