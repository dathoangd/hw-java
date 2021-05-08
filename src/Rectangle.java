package src;

public class Rectangle {
    int height = 15;
    int width = 7;

    void perimeter(){
        int perimeter = (height+width)*2;
        System.out.println("Chu vi hình chữ nhật là: " + perimeter + "cm");

    }

    void area() {
        int area = height*width;
        System.out.println("Diện tích hình chữ nhật là: "+ area + "cm2");
    }


}
