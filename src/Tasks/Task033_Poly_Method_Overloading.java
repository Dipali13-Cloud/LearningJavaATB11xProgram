package Tasks;

public class Task033_Poly_Method_Overloading {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.mul(5,5));
        System.out.println(m.mul(3.4,6.7));
        System.out.println(m.mul(4,7,9));
    }
}
class Multiply{
    int mul(int a, int b) {
        return a * b;
    }
    int mul(int a, int b, int c){
        return a*b*c;
    }
    double mul(double a, double b){
        return a*b;
    }
}
