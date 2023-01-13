package aaa;

public class Single2 { //Lazy Initialization : 단일 스레드시 사용 , 효율이 좋음
    private static Single2 instance;

    private Single2(){}

    public static Single2 getInstance(){
        if(instance == null){
            instance = new Single2();
        }
        return instance;
    }

}
