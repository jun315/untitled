package aaa;

public class Gene<T> {
    /*
            제네릭(generic : 데이터 타입을 일반화한다(generalize)는 것을 의미함.
            1.클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높임
            2.반환값에 대한 타입변환 및 타입 검사에 들어가는 노력을 줄임
            클래스와 메소드에만 선언가능

            이와같이 선언된 제네릭클래스를 선언할 땐 타입변수자리에 사용할 실제 타입을 명시해야 함.
            ex) Gene<Integer> gen = new Gene<Integer>();
                                    new Gene<>();       <- java SE 7 부터 타입 추정이 가능할 시 생략 가능
     */
    T element;
    void setElement(T element){
        this.element = element;
    }
    T getElement(){
        return element;
    }
}
