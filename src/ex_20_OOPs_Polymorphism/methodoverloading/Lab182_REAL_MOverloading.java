package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab182_REAL_MOverloading {
    public static void main(String[] args) {
        Father f = new Father();
        f.task(3);
        f.task(7,8,9);
        f.task(5,9);
    }

}
class Father{
    void task(int a){
        System.out.println(a);
    }
     void task(int a, int b){
         System.out.println(a+b);
     }
     void task(int a,int b,int c){
         System.out.println(a+b+c);
     }

}
