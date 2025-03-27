package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab136_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Dipali");
        stringBuffer.append("Chitte");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());             // Output: ettihCilapiD


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);  // Hello
    }
}
