package ex_14_Strings;

public class Lab137_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Dipali");
        stringBuilder.append("Kunwar");
        System.out.println(stringBuilder);

        String s = "Hello";
        String s1 = " World!";
        String s2 = s + s1;
        System.out.println(s2);
    }
}
