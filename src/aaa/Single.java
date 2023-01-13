package aaa;

public class Single {//Eager Initialization 방식으로 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기에 낭비가 될 수 있다.
    private static final Single instance = new Single();
    private Single(){
        //생성자는 외부에서 호출하지 못하도록 private로 지정한다.
    }
    public static Single getInstance(){
        return instance;
    }

}
