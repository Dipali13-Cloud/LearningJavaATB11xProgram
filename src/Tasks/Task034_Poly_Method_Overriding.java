package Tasks;

public class Task034_Poly_Method_Overriding {
    public static void main(String[] args) {
        Persons person = new Persons();
        person.introduce();

        Persons p = new Student();
        p.introduce();

        Persons p1 = new Teacher();
        p1.introduce();
    }

}
class Persons{
    void introduce(){
        System.out.println("I am a Person!");
    }
}
class Student extends Persons{
    @Override
    void  introduce(){
        System.out.println("I am a Student!");
    }
}
class Teacher extends Persons{
    @Override
    void introduce(){
        System.out.println("I am a Teacher!");
    }
}
