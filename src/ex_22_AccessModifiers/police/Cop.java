package ex_22_AccessModifiers.police;

public class Cop {
    public int gun = 100;
    private String idCard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    protected void canIShoot(){
        System.out.println("Yes you can shoot!!");
    }

    public void defaultMethod(){
        System.out.println("Default Method");
    }
}
