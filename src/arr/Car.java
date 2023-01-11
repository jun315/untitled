package arr;

public class Car {
    public static int num = 10;     //클래스 변수
    String name;        //인스턴스 변수

    {       //인스턴스 초기화 블록 : 초기화블록은 생성자보다 먼저 호출됨

    }
    static{ //클래스 초기화 블록

    }
    void method(){  //인스턴스 메소드
        int iii = 10;   //지역 변수 , 지역변수는 클래스변수 , 인스턴스 변수와 달리 초기화를 시켜주지 않으면 오류가 난다.
        name = "하이";
        num = 20;
    }

    static void door(){     //클래스 메소드 , 인스턴스 생성하지 않고 바로 사용할 수 있다.
        //name = "하이";
    }
}
