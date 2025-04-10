package Tasks.OOpsConcepts.Encapsulation;

public class Task029_ATB_Encapsulation {
    public static void main(String[] args) {


        ATB atb = new ATB(101,"Dipa","Automation Testing");
        System.out.println(atb.getId());
        System.out.println(atb.getName());
        System.out.println(atb.getCourse_name());
        System.out.println("------------------------------------------------------");
        atb.setId(201);
        System.out.println(atb.getId());
        atb.setCourse_name("Automation Testing Blueprint Batch");
        System.out.println(atb.getCourse_name());
    }

}
// Constructor
class ATB{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    private int id;
    private String name;
    private String course_name;

    ATB(int id,String name,String course_name){

        this.id = id;
        this.name = name;
        this.course_name = course_name;

    }


}
