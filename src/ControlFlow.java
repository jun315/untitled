public class ControlFlow {
    void conditionalStatements(){
        System.out.println("control flow statements");
        System.out.println("conditional statements : if, else if, switch");
        int i = (int)Math.random()*10;
        if(i <= 3){
            System.out.println("if문");
        }else{
            System.out.println("else문");
        }

        int result = i >= 1 ? 1 : 2;
        //삼항연산자

        switch(i) {
            case 1:
                System.out.println("i의 값은 1이다.");
                break;
            default:
                System.out.println("i의 값은 모른다");
                break;
        }
    }
    void iterationStatements(){
        System.out.println("Control flow statements");
        System.out.println("Iteration Statements : while, do/while, for, Enhanced for");
        int i = (int)Math.random()*100;

        while(i > 70){
            System.out.println("while문 실행중 i는 70보다 크다.");
            System.out.println("i의 값 : " + i);
            i--;
        }

        do{
            System.out.println("do-while문 실행중.");
            System.out.println("현재 i의 값 :" + i);

        } while(i>80); //;를 쳐야됨.

        for(;i<=30;i++){
            System.out.println("for문 실행중");
            System.out.println("for(초기식;조건식;증감식)");
            System.out.println("i의 값 : " + i);
        }
    }

    void etc(){
        System.out.println("기타 제어문");
        System.out.println("continue, break");
    }
}
