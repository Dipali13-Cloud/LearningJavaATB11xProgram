package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab183_MOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal sound!");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}
