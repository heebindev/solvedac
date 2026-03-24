package class1;

import java.util.Scanner;

public class Baejoon2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        int F = (A*A + B*B + C*C + D*D + E*E) % 10;

        System.out.println(F);
    }
}
