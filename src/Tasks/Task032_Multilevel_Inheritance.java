package Tasks;

public class Task032_Multilevel_Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Lion l = new Lion();
        l.sound();
        l.roar();

        Cub s = new Cub();
        s.sound();
        s.roar();
        s.cuteSound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes a sound!");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Lion roars!");
    }
}
class Cub extends Lion{
    void cuteSound(){
        System.out.println("Cub makes a cute sound!");
    }
}