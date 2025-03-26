package ex_14_Strings;

public class Lab140_StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("After append: "+sb);

        sb.insert(5," Java");
        System.out.println("After insert: "+sb);

        sb.replace(6,10,"Beautiful");
        System.out.println("After replace: "+sb);

        sb.delete(6,15);
        System.out.println("After delete: "+sb);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: "+sb);

        sb.reverse();
        System.out.println("After reverse: "+sb);

        System.out.println("Capacity: "+sb.capacity());

        System.out.println("Length: "+sb.length());

        System.out.println("Character ae 3: "+sb.charAt(3));

        System.out.println("Substring: "+sb.substring(2,6));

        sb.setCharAt(0,'H');
        System.out.println("After setCharAt: "+sb);

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: "+sb.capacity());

        String result = sb.toString();
        System.out.println("Final string: "+result);
    }
}
