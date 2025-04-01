package ex_17_OOPs;

public class Lab161_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        new Cat();

        c1.running();
        // c2.running();     // it will give error because no object is created

        new Cat().running();
        System.out.println(new Cat().name);

    }
}
class Cat{
    String name;           // null
     void running()
     {
         System.out.println("Cat is running");
     }
}
