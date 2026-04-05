package class1;

import java.util.Scanner;

public class Baejoon10952 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while (sn. hasNextInt()){

            int A = sn.nextInt();
            int B = sn.nextInt();

            if (!(A==0 && B ==0)) {
                System.out.println(A+B);
            } else{
                break;
            }

        }
    }
}
