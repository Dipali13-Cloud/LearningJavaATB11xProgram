package ex_22_OOPs_accessModifer.Police;

public class Cop {
    private int gun;
    String iCard;

    // para cons
    public Cop(int bullet){

        this.gun = bullet;
    }

    // method
   protected void canIshoot(){
        System.out.println("Yes..You can shoot!");
    }
}
