package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab141_StringBufferfun {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Welcome to ");

        // 1. append() — Adding text at the end
        sb.append("Java Programming");
        System.out.println("After append: " + sb);

        // 2. insert() — Inserting text at a specific position
        sb.insert(11, "StringBuffer ");
        System.out.println("After insert: " + sb);

        // 3. replace() — Replacing part of the string
        sb.replace(11, 24, "the World of");
        System.out.println("After replace: " + sb);

        // 4. delete() — Deleting a range of characters
        sb.delete(8, 11);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt() — Deleting a single character
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse() — Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. capacity() — Checking the capacity of the buffer
        System.out.println("Current Capacity: " + sb.capacity());

        // 8. length() — Checking the length of the string
        System.out.println("Current Length: " + sb.length());

        // 9. setCharAt() — Changing a specific character
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 10. ensureCapacity() — Ensuring minimum capacity
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        // 11. substring() — Extracting a substring
        String sub = sb.substring(5, 10);
        System.out.println("Extracted Substring: " + sub);

        // 12. toString() — Converting to a string
        String finalResult = sb.toString();
        System.out.println("Final String: " + finalResult);
    }
}
