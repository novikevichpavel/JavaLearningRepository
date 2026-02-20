package Lesson5;

public class Car {
    String color;
    String engine;

    Car (String carsColor, String carsEngine){
        color = carsColor;
        engine = carsEngine;
    }

    void showCarInfo(){
        System.out.println("Cars engine is " + engine + ". Cars color is " + color + ".");
    }
}

class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car("red", "v8");
        firstCar.showCarInfo();
    }
}
