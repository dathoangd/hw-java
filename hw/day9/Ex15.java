package hw.day9;

public class Ex15 {
    static void CountChar (String str, char chr) {
        int  count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + chr +
                " trong chuỗi " + str + " = " + count);

    }
}
