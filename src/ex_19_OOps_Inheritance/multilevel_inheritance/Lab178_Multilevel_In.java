package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab178_Multilevel_In {
    public static void main(String[] args) {
        Son amit = new Son();
        amit.son();;
        amit.father();
        amit.grandfather();
        System.out.println(amit.gf_Gold);

        Father f = new Father();
        f.home();

        GrandFather gf = new GrandFather();
        gf.home();;

        GrandFather gf1 = new Son();
        gf1.home();
    }
}
