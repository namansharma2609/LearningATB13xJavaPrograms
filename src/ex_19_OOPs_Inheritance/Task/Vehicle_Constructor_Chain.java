package ex_19_OOPs_Inheritance.Task;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}
