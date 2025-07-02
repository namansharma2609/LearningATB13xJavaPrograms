package ex_19_OOPs_Inheritance.Task;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        SuperAdmin s1 = new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();
    }

}

class User{
    void login(){
        System.out.println("User has logged in");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Admin panel can be accessed");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("Shutting down the System");
    }
}
