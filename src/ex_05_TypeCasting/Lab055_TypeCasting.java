package ex_05_TypeCasting;

public class Lab055_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 8956748329L;
       // short s = phone_no;          // not allowed -> implicit ?
        short s1 = (short) phone_no;
        System.out.println(s1);

    }
}
