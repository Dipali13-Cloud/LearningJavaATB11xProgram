package Tasks.OOpsConcepts.Constructor;

public class Task21_Person_Class_with_DC_PC {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        System.out.println(p1.name);
        System.out.println("---------------");

        Person1 p2 = new Person1("Dipa", 31, "Nasik", 8978678934L, true);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);
        System.out.println(p2.phone);
        System.out.println(p2.isFemale);
        System.out.println("----------------");

        Person1 p3 = new Person1("Divya", "Pune", true);
        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println(p3.address);
        System.out.println(p3.phone);
        System.out.println(p3.isFemale);
        System.out.println("----------------");

        p2.print_details();

        p3.print_details();

        p1.sleep();
        p2.do_homework();
        p3.walk();
        p2.eat();
    }
}

class Person1 {

    String name;
    int age;
    String address;
    long phone;
    boolean isFemale;

    void eat() {
        System.out.println(this.name + " is eating!");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping!");
    }

    void walk() {
        System.out.println(this.name + " is walking!");
    }

    void do_homework() {
        System.out.println(this.name + " is doing homework!");
    }

    void print_details() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
        System.out.println("phone:" + phone);
        System.out.println("Isfemale:" + isFemale);
        System.out.println("-------------------");
    }

    Person1() {

        name = "Dipali";
        age = 31;
        address = "Nasik";
        phone = 7898674578L;
        isFemale = true;

    }

    Person1(String name_arg, int age_arg, String address_arg, long phone_arg, boolean isFemale_arg) {
        this.name = name_arg;
        this.age = age_arg;
        this.address = address_arg;
        this.phone = phone_arg;
        this.isFemale = isFemale_arg;
    }

    Person1(String name_arg, String address_arg, boolean isFemale_arg) {
        this.name = name_arg;
        this.address = address_arg;
        this.isFemale = isFemale_arg;
    }
}
