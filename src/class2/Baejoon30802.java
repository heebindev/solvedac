package class2;

import java.util.Scanner;

public class Baejoon30802 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int N = sn.nextInt(); //23

        int S = sn.nextInt(); //3명
        int M = sn.nextInt(); //1명
        int L = sn.nextInt(); //4명
        int XL = sn.nextInt(); //1명
        int XXL = sn.nextInt(); //5명
        int XXXL = sn.nextInt(); //9명

        int T = sn.nextInt(); // 티셔츠 5장씩 구매
        int P = sn.nextInt(); //펜 7장 구매

        int countT = 0; //T개씩의 묶음 수
        int countP = 0; //P개씩의 묶음 수
        int onePen = 0; //펜 1개씩..

        //티셔츠 로직
        if(S%T==0){
            countT += S/T;
        }else{
            countT += S/T + 1;
        }
        if(M%T==0){
            countT += M/T;
        }else{
            countT += M/T + 1;
        }
        if(L%T==0){
            countT += L/T;
        }else{
            countT += L/T + 1;
        }
        if(XL%T==0){
            countT += XL/T;
        }else{
            countT += XL/T + 1;
        }
        if(XXL%T==0){
            countT += XXL/T;
        }else{
            countT += XXL/T + 1;
        }
        if(XXXL%T==0){
            countT += XXXL/T;
        }else{
            countT += XXXL/T + 1;
        }

        //펜 로직
        countP =+ N/P;
        onePen = N - P*(N/P);

        System.out.println(countT);
        System.out.println(countP + " " + onePen);

    }
}

//티셔츠는 6종류. 각 종류별로 T장씩 한번에 구매
//펜은 1종류, 한번에 P개씩 구매 or 1개씩 구매
//주문한 사람수는 S, M, L, XL, XXL, XXXL명.
//티셔츠 남아도 ok, 펜은 정확 참가자 수만큼 준비
// ->T장씩 몇개 구매, 펜을 최대 P개로 몇 자루 구매할지.
//전체 N명