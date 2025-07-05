package ex_20_OOPs_Polymorphism.methodoverride;

public class Lab190_MethodOverride_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToALl cta1 = new CommonToALl();
        cta1.openBrowser();
    }
}

class CommonToALl {
    void openBrowser(){
        System.out.println("Starting IE Browser!!!");
    }
}

class ChromeTC extends CommonToALl{

    @Override
    void openBrowser(){
        System.out.println("Starting Chrome!!!");
    }
}

class Firefox extends CommonToALl{

    @Override
    void openBrowser(){
        System.out.println("Starting Firefox!!");
    }
}
