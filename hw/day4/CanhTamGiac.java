package hw.day4;

public class CanhTamGiac {
    public void TinhCanhTamGiac (double x1, double x2, double x3){
        if ((x1 + x2 > x3) || (x1 + x3 > x2) || (x2 + x3 > x1)) {
            System.out.println("Đây là tam giác !");
        }
        if ((x1 == x2) || (x2 == x3) || (x3 == x1)) {
            System.out.println("Đây là tam giác cân !");
        } else if ((x1 == x2) && (x2 == x3) && (x3 == x1)) {
            System.out.println("Đây là tam giác đều !");
        } else if ((x1 * x1 == x2 * x2 + x3 * x3) || (x2 * x2 == x1 * x1 + x3 * x3) || (x3 * x3 == x2 * x2 + x1 * x1)) {
            System.out.println("Đây là tam giác vuông !");
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }

}
