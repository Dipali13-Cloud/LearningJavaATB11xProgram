package ex_18_OOPs_Constructor;

public class Lab171_PC {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2();

        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c3 = new Car2("Tesla","Model 3",1990);
        System.out.println(c3.name);

        Car2 c4 = new Car2("Scorpio","Mahindra",2020);
        System.out.println(c4.name);

        Car2 c5 =new Car2("Tata","Curvv",2024);
    }
}
class Car2
{
    String name;
    String model;
    int year;


    // DC
    Car2() {
        model = "XXX";
        year = 1900;
        name = "Unknown Car!";
        System.out.println("DC");

    }
    // Param - Constructor
    Car2(String name_oc_arg,String model_oc_arg,int year_oc_arg){
    this.name = name_oc_arg;
    this.model = model_oc_arg;
    this.year = year_oc_arg;
    }

}

