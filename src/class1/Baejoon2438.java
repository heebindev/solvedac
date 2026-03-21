package class1;

import java.util.Scanner;

public class Baejoon2438 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int N = sn.nextInt();
        int i = 0;
        String s = "";
        while (i < N)  {
            i++;
            s += "*";
            System.out.println(s);
        }
    }
}