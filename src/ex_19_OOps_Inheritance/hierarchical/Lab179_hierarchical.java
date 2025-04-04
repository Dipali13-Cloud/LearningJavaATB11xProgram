package ex_19_OOps_Inheritance.hierarchical;

public class Lab179_hierarchical {
    public static void main(String[] args) {

        Father f = new Father();
        Daughter d = new Daughter();
        d.home();
        f.home();

        Son1 s1 = new Son1();
        s1.home();

        Son2 s2 = new Son2();
        s2.s2();
        s2.home();
    }
}
class Father{
    void home(){
        System.out.println("3BHK");
    }
}
class Son1 extends Father{
    void s1(){
        System.out.println("Son1");
    }
}
class Son2 extends Father{
    void s2(){
        System.out.println("Son2");
    }
}
class Daughter extends Father{
    void d1(){
        System.out.println("Daughter");
    }
}