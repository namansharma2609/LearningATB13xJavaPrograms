package ex_20_OOPs_Polymorphism.overloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.openBrowser();

        b1.openBrowser("Chrome");
        b1.openBrowser("Safari");

    }
}

class Browser{
    void openBrowser(){
        System.out.println("Starting Default Browser!!");
    }

    String openBrowser(String browser){
        System.out.println("Starting browser "+ browser);
        return browser;
    }



}
