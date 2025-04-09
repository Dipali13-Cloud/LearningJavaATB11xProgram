package Tasks.OOpsConcepts.Inheritance;

public class Task026_Multiple_Inheritance {
    public static void main(String[] args) {
      //  C c = new C();
      //  c.display();       // Ambiguity: A.display() or B.display()?

    }

}
// Parent1 class
class A{
    void display(){
        System.out.println("Display from A.");
    }
}

// Parent2 class
class B{
    void display(){
        System.out.println("Display from B.");
    }
}

// Child class trying to inherit both A and B
//class C extends A,B {

    // Compilation error
    // Which display() should be used? A or B?
    // Ambiguity,Diamond Problem

// }
