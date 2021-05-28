package hw.day10;

public class RemoveDupChar {
    public static  String removeDuplicateCharacter(String input) {

        String result = new String();
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }
}
