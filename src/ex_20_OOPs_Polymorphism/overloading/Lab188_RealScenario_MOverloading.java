package ex_20_OOPs_Polymorphism.overloading;

public class Lab188_RealScenario_MOverloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(2);
        h1.task(3.10f);
        h1.task(false);
    }
}

class Home{

    int task(int a){
        System.out.println("TASK1");
        return a;
    }

    void task(){
        System.out.println("TASK1");
    }

    float task(float a){
        System.out.println("TASK1");
        return a;
    }

    boolean task(boolean a){
        System.out.println(a);
        return a;
    }
}
