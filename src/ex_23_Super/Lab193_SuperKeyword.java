package ex_23_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.getMaxSpeed();

        c1.display();
    }
}

class Vehicle{
    public int maxSpeed = 100;

    Vehicle(){
        System.out.println("DC");
    }

    Vehicle(int a){
        System.out.println("PC");
        System.out.println("PC "+ a);
    }

    void message(){
        System.out.println("Type1");
    }

    void message(int a){
        System.out.println("Type2");
    }

    int message(String a){
        System.out.println("Type4");
        return 0;
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 300;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
        System.out.println("Car DC");
    }

    Car (int a){
        System.out.println("Car Param Const.");
    }

    @Override
    void display() {
        System.out.println("Car Child");
        super.display();
        System.out.println(super.maxSpeed);
        System.out.println(maxSpeed);
    }
}
