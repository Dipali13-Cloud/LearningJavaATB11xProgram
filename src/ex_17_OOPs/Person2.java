package ex_17_OOPs;

public class Person2 {                         // in one class file there is only one public class

    public static void main(String[] args) {   // in the JDk_13 above versions we can have multiple main methods,
                                               // and we can run them separately
        System.out.println("Bye");
    }
}


class P1 {}

class P2 {}

//class 123{}                            // className can't start with digits
class $123 {}

class _123 {}

//class a b {}                           // space is not allowed
class P3 {}
//class P3{}                             // duplicate class is not allowed

class P4 {};

class P5 {

    class P6 {
        class P7 {
            class P8 {
                                        // class within class , it has no limit
            }
        }
    }

}

class P8{
    public static void main(String[] args) {       // 2 main methods in one file
                                                   // because in the JDK_13 above versions it is possible
        System.out.println("P8");
    }
}
