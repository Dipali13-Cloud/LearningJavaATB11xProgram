package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab181_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
       int res = m.add(56,78);
        System.out.println(res);
        int res1 = m.add(89,79,80);
        System.out.println(res1);
       double res2 = m.add(45.90,59.50);
        System.out.println(res2);
    }

}
class MathOperations{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b)
    {
        return a+b;
    }
}
