package ex_18_OOPs_Constructor;

public class Lab170_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("------------");

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);

    }
}
class Car{
    String name;
    int year;
    String model;


    Car(){
        name = "Unknown car";
        year = 1991;
        model = "XXX";
    }
}
