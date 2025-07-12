package ex_22_AccessModifiers;

public class Lab192 {
    public static void main(String[] args) {
        Son s = new Son();
        s.weCanUse();
    }
}

class Father{
    private int gold = 100;
    private String car = "Audi";

    protected int home = 1;
}

class Son extends Father{
    void weCanUse(){
        System.out.println(home);
        //System.out.println(car);
        //System.out.println(gold);
    }
}
