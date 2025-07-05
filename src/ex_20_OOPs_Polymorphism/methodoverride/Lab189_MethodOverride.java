package ex_20_OOPs_Polymorphism.methodoverride;

public class Lab189_MethodOverride {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        Animal a = new Animal();
        System.out.println(d.equals(a));

    }
}

class Animal{
    void sound(){
        System.out.println("Default sound!!");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Dog Barks!!!");
    }
}


