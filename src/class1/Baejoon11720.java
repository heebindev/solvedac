package class1;

import java.util.Scanner;

public class Baejoon11720 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int N = sn.nextInt();
        String input = sn.next();
        int sum = 0;

        for(int i = 0; i < N ; i++){
            int a = input.charAt(i) -'0'; // 문자열의 인덱스의 문자를 받아서 정수로 변환.
            sum += a;
        }

        System.out.println(sum);

    }
}