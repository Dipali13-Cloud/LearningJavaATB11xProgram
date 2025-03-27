package ex_16_Arrays;

public class Lab142_ArraysOp {
    public static void main(String[] args) {
        int [] marks = {91,90,51,100,91,92,89};
        boolean [] ismarried_people = {true,true,false};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
      //  System.out.println(marks[10]);      // ArrayIndexOutOfBoundsException
      //  System.out.println(marks[-1]);      // ArrayIndexOutOfBoundsException

        System.out.println(ismarried_people[0]);

    }
}
