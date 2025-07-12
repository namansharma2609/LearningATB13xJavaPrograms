package ex_21_Encapsulation;

public class Lab189_EnCap_LoginVWO {
    public static void main(String[] args) {

        ProtectedVWOLogin user1 = new ProtectedVWOLogin("admin1","admin@123");

        String getPass = user1.getPassword();
        System.out.println(getPass);


        user1.setPassword("pass",true);
        String passNew = user1.getPassword();

        System.out.println(passNew);



    }

}


class ProtectedVWOLogin{
    private String username;
    private String password;

    ProtectedVWOLogin(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin){
            this.password = password;
        }
        else{
            System.out.println("You don't have access to update password!!");
        }
    }
}