package Tasks;

public class Task030_ATB_Student_Array {
    public static void main(String[] args) {
        ATBStudents[] students = new ATBStudents[3];

        students[0] = new ATBStudents(101,"Dipali",31,"Java");
        students[1] = new ATBStudents(102,"Priya",31,"Python");
        students[2] = new ATBStudents(103,"Nutan",31,"C##");

        for (ATBStudents stud:students)
        {
            System.out.println(stud);
        }
    }
}
class ATBStudents{
    int id;
    String name;
    int age;
    String course;

    public ATBStudents(int s_id, String s_name, int s_age,String course_name){
        this.id = s_id;
        this.name = s_name;
        this.age = s_age;
        this.course = course_name;
    }

    public String toString(){
        return "Id: "+ id + "  Name: "+name + "   Course Name: "+course;
    }

}
