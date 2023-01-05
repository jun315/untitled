import arr.Array;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;

        //참조
        ControlFlow cf = new ControlFlow();
        arr.Array ar = new arr.Array();

        System.out.println("0 : Exit");
        System.out.println("1~3 : Control flow Statements");
        System.out.println("4 : Array");

//클래스 실행
        while(x == 1) {
            System.out.print("숫자 입력 : ");
            int click = sc.nextInt();
            switch (click) {
                case 0:
                    x=0;
                    break;
                case 1:
                    cf.conditionalStatements();
                    break;
                case 2:
                    cf.iterationStatements();
                    break;
                case 3:
                    cf.etc();
                    break;
                case 4:
                    ar.arr();
                    break;
            }
        }




    }
}