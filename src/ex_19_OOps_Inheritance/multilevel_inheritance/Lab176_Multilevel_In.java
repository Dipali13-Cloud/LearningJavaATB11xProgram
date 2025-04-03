package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab176_Multilevel_In {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.grandfather();

        System.out.println("------------");

        Father f = new Father();
        f.father();
        f.grandfather();

        System.out.println("------------");

        Son s = new Son();
        s.son();
        s.father();
        s.grandfather();
    }
}
