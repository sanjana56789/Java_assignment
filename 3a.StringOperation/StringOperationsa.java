package stringhandlingfunc3abc;

import java.util.Arrays;

public class StringOperationsa {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str2: " + str2.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Index of 'lo' in str1: " + str1.indexOf("lo"));
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

        // 5. Substring Operations
        System.out.println("Substring of str1 (1,4): " + str1.substring(1,4));

        // 6. String Modification
        String replaced = str1.replace('l', 'p');
        System.out.println("Replaced 'l' with 'p' in str1: " + replaced);
        System.out.println("str2 to upper case: " + str2.toUpperCase());
        System.out.println("str2 to lower case: " + str2.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpaces = "   Hello World   ";
        System.out.println("Original string with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concat);

        // 9. String Splitting
        String csv = "Java,Python,C++,JavaScript";
        String[] languages = csv.split(",");
        System.out.println("Languages array: " + Arrays.toString(languages));

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder content: " + sb.toString());
        sb.replace(6, 11, "Java");
        System.out.println("After replace in StringBuilder: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 30;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "alice@example.com";
        boolean isValidEmail = email.contains("@") && email.startsWith("a") && email.endsWith(".com");
        System.out.println("Email '" + email + "' is valid? " + isValidEmail);

        // Example of invalid email
        String invalidEmail = "bobexample.org";
        boolean isInvalidValid = invalidEmail.contains("@") && invalidEmail.startsWith("b") && invalidEmail.endsWith(".com");
        System.out.println("Email '" + invalidEmail + "' is valid? " + isInvalidValid);
    }
}
