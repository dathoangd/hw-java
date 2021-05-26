package hw.day9;

import java.util.Scanner;

public class hwEx9 {
    public static void printTriangleStar( int height) {
            for (int i = 0; i < height; i++) {
                for (int j = height - i; j > 1; j--) {
                    System.out.print("   ");
                }

                for (int j = 0; j <= 2 * i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

