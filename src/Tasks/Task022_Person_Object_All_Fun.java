package Tasks;

public class Task022_Person_Object_All_Fun {
    public static void main(String[] args) {
     Person p1 =new Person();
     p1.greet();
     p1.person_Details("Dipali","Kunwar");
     p1.other_Details(32,"9467898756",1000);
     boolean marriedStatus = p1.marriage_Details();
        System.out.println("Is married?" +marriedStatus);

    }
}
class Person{
    String fname;
    String lname;
    int age;
    boolean gen;
    double weight;
    float height;
    double salary;
    String mobile;
    String eyes_colour;
    boolean is_Married;

     void greet(){
        System.out.println("Hello");
    }

     String person_Details(String fname, String lname){
       String fullName = fname +" " + lname;
         System.out.println("Name: "+fullName);
        return fullName;
    }

    void other_Details(int age,String mobile,double salary){
        System.out.println("Age: " + age + "\nMobile No: " + mobile +"\nSalary: " +salary);
    }

    boolean marriage_Details()
    {
        is_Married=true;
        return is_Married;
    }
}
