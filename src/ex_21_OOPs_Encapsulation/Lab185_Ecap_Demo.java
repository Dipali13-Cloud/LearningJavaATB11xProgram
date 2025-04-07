package ex_21_OOPs_Encapsulation;

public class Lab185_Ecap_Demo {
    public static void main(String[] args) {

        VWOLogin v = new VWOLogin("admin","Pwd@99");
        System.out.println(v.uname);
        System.out.println(v.pword);

        v.pword = "Admin@99";
        System.out.println(v.pword);
        System.out.println("--------------------------");


        GoodVWOLogin g = new GoodVWOLogin("dipa","dipa@00");
        System.out.println(g.getUsername());
        System.out.println(g.getPassword());

        System.out.println("--------------------------");

        g.setUsername("Divya");
        System.out.println(g.getUsername());

        g.setPassword("D@90",false);
        System.out.println(g.getPassword());

    }
}
class VWOLogin{
    public String uname;
    public String pword;

    VWOLogin(String uname,String pwd){
        this.uname = uname;
        this.pword = pwd;
    }
}
class GoodVWOLogin{
    private String username;  // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("You are not allowed!");
        }
    }

    public GoodVWOLogin(String name, String pass){
        this.username = name;
        this.password = pass;


    }
}