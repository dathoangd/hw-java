package hw.day9;

public class hwEx10 {
    public static void printRectangleStar(int height, int width){
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
        }
    }
}
