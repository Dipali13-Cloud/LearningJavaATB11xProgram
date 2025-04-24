package Tasks;

public class Task038_ATB_Encap {
    public static void main(String[] args) {

        ATB stud = new ATB("Riya",30,"Software Testing");
        System.out.println(stud.getName());
        System.out.println(stud.getAge());
        System.out.println(stud.getCourse());

        System.out.println("---------------------------------");

        System.out.println("After updation");

        stud.setName("Priya");
        stud.setAge(32);
        stud.setCourse("Automation Testing");
        System.out.println(stud.getName());
        System.out.println(stud.getAge());
        System.out.println(stud.getCourse());

    }

     static class ATB{
        private String name;
        private int age;
        private String course;

        public ATB(String sname, int sage, String scourse){
            this.name = sname;
            this.age = sage;
            this.course = scourse;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }
    }


}
