package Tasks.OOpsConcepts.Polymorphism;

public class Task028_Method_Overriding {
    public static void main(String[] args) {
        Shapes s1 = new Square();
        s1.draw();

        Shapes s2 = new Circle();
        s2.draw();
    }
}

//
class Shapes{
    void draw(){
        System.out.println("Drawing a shape.");
    }
}

//
class Square extends Shapes{
    void draw(){
        System.out.println("Drawing a Square.");
    }
}

//
class Circle extends Shapes{
    void draw(){
        System.out.println("Drawing a Circle.");
    }
}