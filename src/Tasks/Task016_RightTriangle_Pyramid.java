package Tasks;

public class Task016_RightTriangle_Pyramid {
    public static void main(String[] args) {

        // ✅ Right Triangle Star Pattern
        // *
        // **
        // ***
        // ****
        // *****
        int n = 5;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
