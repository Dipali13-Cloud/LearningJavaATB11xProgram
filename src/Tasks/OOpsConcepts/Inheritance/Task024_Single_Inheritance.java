package Tasks.OOpsConcepts.Inheritance;

public class Task024_Single_Inheritance {
    public static void main(String[] args) {
        Flower f = new Flower();
        f.fragrance();

        Rose r = new Rose();
        r.colour();
        r.fragrance();
    }
}

// parent class
class Flower{
    void fragrance(){
        System.out.println("Flowers have a pleasant fragrance!");
    }
}

// child class
class Rose extends Flower{
    void colour(){
        System.out.println("Roses have different colours!");
    }
}
