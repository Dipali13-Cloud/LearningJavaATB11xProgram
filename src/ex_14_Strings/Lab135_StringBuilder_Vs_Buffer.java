package ex_14_Strings;

public class Lab135_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String - 90% used
        String s0 = "Dipa";
        String s1 = new String("Dipa");
    StringBuilder stringBuilder = new StringBuilder("Dipa");
    StringBuffer stringBuffer = new StringBuffer("Dipa");

        // less than <10% used
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
