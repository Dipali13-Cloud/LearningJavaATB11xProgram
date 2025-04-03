package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab177_Multilevel_In {
    public static void main(String[] args) {

        Son Amit = new Son();
        // Son s1 = new GrandFather();         not possible
        // Son s1 = new Father();              not possible

        GrandFather gf1 = new Son();
        gf1.grandfather();
        gf1.home();

        GrandFather gf2 = new Father();
        gf2.home();

        // Father f3 = new GrandFather();      not possible
        Father f1 = new Father();
        f1.home();

        Father f2 = new Son();
        f2.home();
    }
}
