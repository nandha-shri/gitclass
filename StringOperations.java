import java.util.*;
public class StringOperations
{
    public static void main(String[] args) 
    {
        String message = "Welcome to Department of AI";

        // Retrieve the length of the String
        int length = message.length();
        System.out.println("Length of the string: " + length);

        // Extract a substring starting from index 7 to the end of the string
        String substring = message.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Convert the entire string to lowercase
        String lowercase = message.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);

        // Replace all occurrences of the character 'o' with 'a' in the string
        String replacedString = message.replace('o', 'a');
        System.out.println("String after replacement: " + replacedString);

        // Check if the string starts with the substring "Welcome"
        boolean startsWithWelcome = message.startsWith("Welcome");
        System.out.println("String starts with 'Welcome': " + startsWithWelcome);

        // Remove the leading and trailing space in the string
        String trimmedString = message.trim();
        System.out.println("Trimmed string: " + trimmedString);
    }
}
