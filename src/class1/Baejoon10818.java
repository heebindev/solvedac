package class1;

import java.util.Scanner;

public class Baejoon10818 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int N = sn.nextInt(); // 몇개의 입력인지

        int first = sn.nextInt();
        int min = first;
        int max = first;

        for (int i = 1; i<N; i++){
            int k = sn.nextInt();

            if (k > max){
                max = k ;
            }
            if(k< min){
                min = k;
            }
        }
        System.out.println(min + " "+ max);
    }
}
