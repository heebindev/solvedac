package class1;

import java.util.Scanner;

public class Baejoon2675 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        //몇개의 문장을 수행할 것인지.
        int T = sn.nextInt(); //입력 2

        for (int Time = 0; Time < T; Time++){ //2번의 문장에 반복
            int R = sn.nextInt(); //몇번 반복
            String S = sn.next(); //문자열 S

            int len = S.length(); //문자열 S의 길이
            for (int i = 0; i < len; i++) {
                for (int n = 0; n < R; n++) {
                    System.out.print(S.charAt(i));
                }
            }
        }

    }
}