package ex_19_OOps_Inheritance;

public class Lab174_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.bhk2();
        System.out.println(f1.gold);
        // f1.bhk3();                          //Parent can't access child property/method

        Son s1 = new Son();
        s1.bhk3();
        System.out.println(s1.gold);          // child(Son) can access Parent(Father) property/method
                                              // (because of inheritance(extends) )
        s1.bhk2();
    }
}
class Father{
    int gold = 100;                          // Attribute | Data variables |  Property | Instance Variables
    void bhk2(){                             //  Behaviour |  Method | Function | Data members
        System.out.println("Father has 2bhk house.");
    }
}
class Son extends Father{
    int gold = 1000;
    void bhk3(){
        System.out.println("Son has 3bhk house.");
    }
}