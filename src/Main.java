import aaa.Single2;
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

        aaa.Car car = new aaa.Car("GS2000",2000,"검정");

        aaa.Single2 aa = Single2.getInstance();
        aaa.Single2 bb = Single2.getInstance();
        aa.setApple(6);


        System.out.println("apple : " + aa.getApple());
        System.out.println("apple : " + bb.getApple());


//클래스 실행
//        while(x == 1) {
//            System.out.print("숫자 입력 : ");
//            int click = sc.nextInt();
//            switch (click) {
//                case 0:
//                    x=0;
//                    break;
//                case 1:
//                    cf.conditionalStatements();
//                    break;
//                case 2:
//                    cf.iterationStatements();
//                    break;
//                case 3:
//                    cf.etc();
//                    break;
//                case 4:
//                    ar.arr();
//                    break;
//            }
//        }
    }
}