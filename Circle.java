public class Circle {

    double radius = 8;

    void perimeter(){
        double perimeter = Math.PI * radius * 2;
        System.out.println("Chu vi hình tròn có bán kinh = "+ radius + "cm là: " + perimeter + "cm");

    }
    void area(){
        double area = Math.PI * (radius*radius);
        System.out.println("Diện tích hình tròn có bán kinh = "+ radius + "cm là: " + area + "cm2");
    }

}
