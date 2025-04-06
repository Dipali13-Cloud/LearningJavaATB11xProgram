package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {

    int attribute;

    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(99,50);
        c.add(37.14,89.70);
    }
}

