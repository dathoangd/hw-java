package hw.day5;

public class FactorialCalculator {
    public static long FactorialCalculator(int n) {
        long factorial = 1;
        if (n != 0 && n != 1) {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
