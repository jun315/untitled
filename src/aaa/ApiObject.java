package aaa;
// java.lang.*; <<자동으로 로딩된다.
public class ApiObject {
// String toString() 해당 인스턴스의 정보를 문자열로 리턴 - 인스턴스주소값 리턴
// boolean equals(Object obj)  해당 인스턴스를 메소드로 받아 참조변수와 비교 그 결과 반환.

    Car a1 = new Car();
    Car a2 = new Car();
    void ob(){
        System.out.println(a1.toString());
        System.out.println(a2.equals(a1));

    }
}
