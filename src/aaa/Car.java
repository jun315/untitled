package aaa;

public class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String modelName,int modelYear,String color){
        this.color = color;
        this.modelName = modelName;
        this.modelYear = modelYear;
    }
    public Car(String modelName,int modelYear){
        this.color = color;
        this.modelName = modelName;
        this.modelYear = modelYear;
    }
    Car(){
        this("소나타",2020,"블루"); //다른 생성자를 호출.
    }
}
