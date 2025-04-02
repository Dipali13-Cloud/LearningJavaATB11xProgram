package ex_17_OOPs;

public class Lab159_OOPs {
    public static void main(String[] args) {
        Person ALab167_OOps_P2mit;
        Person p2 = new Person();
        // Person - Class
        // p2 - Object Reference
        // new Person() -> Object

        p2.name = "Dipali";
        System.out.println(p2.name);

        Person p3 = new Person();
        p3.name = "Priya";
        System.out.println(p3.name);

        new Person().name = "Lucky";
    }

}

    class Person {
    // Attribute | Properties |  Data Members | Instance variables
    String name;
    String phone;
    String colour_of_eyes;
    int legs;
    byte age;
    double salary;
    double weight;
    boolean is_Female;

    // Behaviour | Function | Method
    void sleep()
    {
        System.out.println("Sleeping");
    }

    String greet(String name)
    {
        return "Hello"+name;
    }

    void talk()
    {
        System.out.println("Talking");
    }

    int remaining_amount_sal(int salary,int tax)
    {
        return salary-tax;
    }
}
