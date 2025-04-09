package Tasks.OOpsConcepts.Inheritance;

public class Task025_Multilevel_Inheritance {
    public static void main(String[] args) {
        Flower1 f = new Flower1();
        f.fragrance();

        Roses r = new Roses();
        r.colour();
        r.fragrance();

        HybridRoses hr = new HybridRoses();
        hr.hybridType();                     // from own method
        hr.colour();                         // from Roses
        hr.fragrance();                      // from Father1
    }
}
// Base class
class Flower1{
    void fragrance(){
        System.out.println("Flowers have a soothing fragrance!");
    }
}

// Intermediate class
class Roses extends Flower1{
    void colour(){
        System.out.println("Roses are usually red, white, pink, yellow, orange!");
    }
}

// Derived class
class HybridRoses extends Roses{
    void hybridType(){
        System.out.println("These are hybrid type roses!");
    }
}

