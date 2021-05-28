package hw.day10;

public class CompareString {
    public static void compareString (String str1, String str2){
        if(str1.contains(str2)) {
            System.out.println(str1 + " chứa chuỗi " + str2);
        } else System.out.println("2 chuỗi không chứa nhau");
    }
}
