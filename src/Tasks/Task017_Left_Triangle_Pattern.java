package Tasks;

public class Task017_Left_Triangle_Pattern {
    public static void main(String[] args) {
        // ✅ Left Triangle Star Pattern
        // *****
        // ****
        // ***
        // **
        // *
        int n=5;
        for (int i=1;i<=n;i++)
        {
            for (int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
