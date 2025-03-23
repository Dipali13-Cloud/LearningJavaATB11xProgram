package ex_12_DoWhile_Loop;

public class Lab118_StudentRecordEx {
    public static void main(String[] args) {
        int currentStudent = 1, totalStudents=5;
        do {
            System.out.println("Processing Student:"+currentStudent);
            System.out.println("Status: Mark sheet generated!");
            System.out.println();
            currentStudent++;
        }while (currentStudent<=totalStudents);

    }
}
