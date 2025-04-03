package ex_18_OOPs_Constructor;

public class Lab173_PC_Constructor_Overloading {
    public static void main(String[] args) {

        Person1 p1 = new Person1("Dipali",98789867,"Nasik");
        System.out.println(p1.name);

        Person1 p2 = new Person1("Nikita",89708956,"Pune");
        System.out.println(p2.address);

        Person1 p3 = new Person1();
        System.out.println(p3.name);

        Person1 p4 = new Person1("Priya",98679089);
        System.out.println(p4.address);

        p1.sleep();
        p2.sleep();

    }

}
class Person1 {
    String name;
    long phone;
    String address;

    Person1() {

    }

    Person1(String name_arg,long phone_arg,String address_arg){
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;
    }

    Person1(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;
    }

    void sleep(){
        System.out.println(this.name+" is sleeping");
    }
}

