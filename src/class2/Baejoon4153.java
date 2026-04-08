package class2;

import java.util.Scanner;

public class Baejoon4153 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();

        while (!(a == 0 && b == 0 && c == 0)) {
            if (a > b && a > c) {
                if (a * a == b * b + c * c) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (b > a && b > c) {
                if (b * b == a * a + c * c) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (c > a && c > b) {
                if (c * c == b * b + a * a) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else {
                System.out.println("wrong");
            }

            a = sn.nextInt();
            b = sn.nextInt();
            c = sn.nextInt();
        }
    }
}