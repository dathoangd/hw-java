package hw.day9;

public class Ex13 {
    static void count(int destination ){
        int count = 0;
            for (int i=0; i <= destination; i ++){
                if(i%3==0){
                    count++;
                }
        }
        System.out.println("Có " + count + " số chia hết cho 3 từ 0 đến " + destination);
    }
}
