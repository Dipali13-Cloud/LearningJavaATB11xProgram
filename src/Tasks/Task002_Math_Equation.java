package Tasks;

public class Task002_Math_Equation {
    public static void main(String[] args) {
        int x=10, y=10, z=10;
        double result = Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println("Answer="+result);
    }
}
