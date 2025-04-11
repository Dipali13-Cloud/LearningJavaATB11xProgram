package Tasks;

public class Task031_Single_Inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.showSpeed();

        Car c = new Car();
        c.showSpeed();     // inherited from Vehicle
        c.showBrand();
    }
}
class Vehicle{
    int speed = 60;
    void showSpeed(){

        System.out.println("Vehicle speed: " + speed + "km/hr");
    }
}
class Car extends Vehicle{
    String brand = "Tata";
    void showBrand(){
        System.out.println("Car brand: " + brand);
    }
}
