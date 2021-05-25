package hw.day9;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
    static List<Integer> positiveInt (int number){
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        while (number > 1) {
            if (number % i == 0) {
                number = number / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }

        if (listNumbers.isEmpty()) {
            listNumbers.add(number);

        }
        return listNumbers;
    }
}
