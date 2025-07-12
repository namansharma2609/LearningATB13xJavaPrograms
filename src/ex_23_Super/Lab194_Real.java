package ex_23_Super;

public class Lab194_Real {
    public static void main(String[] args) {
        Cat billi = new Cat();
        billi.sound();
    }

}


class Animal{

    Animal(){
        System.out.println("DC for Animal");
    }

    void sound(){
        System.out.println("Default sound for Animal");
    }
}

class Cat extends Animal{

    Cat(){
        super();
        System.out.println("DC for Cat");
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Meow!!!");
    }
}
