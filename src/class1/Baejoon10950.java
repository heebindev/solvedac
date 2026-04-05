package class1;

import java.util.Scanner;

public class Baejoon10950 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int T = sn.nextInt(); //테스트 케이스 수

        for (int i = 0; i < T ; i++){
            int a = sn.nextInt();
            int b =sn.nextInt();
            System.out.println(a+b);
        }
        System.out.println();
    }
}
