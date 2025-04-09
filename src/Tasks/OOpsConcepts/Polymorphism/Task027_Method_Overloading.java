package Tasks.OOpsConcepts.Polymorphism;

public class Task027_Method_Overloading {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);
        s.area(8,9);
        s.area(2.1);
    }
}
class Shape{
    // Area of Square
    void area(int side){

        int res = side*side;
        System.out.println("Area of Square: "+res);
    }

    // Area of Rectangle
    void area(int length,int breadth){
        int res = length*breadth;
        System.out.println("Area of Rectangle: "+res);
    }

    // Area of Circle
    void area(double radius){
        double res = 3.14*radius*radius;
        System.out.println("Area of Circle: "+res);
    }
}
