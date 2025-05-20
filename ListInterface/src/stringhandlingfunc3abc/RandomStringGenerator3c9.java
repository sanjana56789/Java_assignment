package stringhandlingfunc3abc;

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator3c9 {
    // Function to generate a random string of given length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);
        System.out.println("Random string: " + randomString);

        scanner.close();
    }
}
