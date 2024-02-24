import java.util.*;
public class StringBuffer
{
    public static void main(String[] args)
     {
        String message1 = "Welcome to Kongu Engineering College";
        String message2 = "Welcome to Artificial Intelligence";

        // Append both the strings
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(message1);
        stringBuffer.append(message2);
        String appendedString = stringBuffer.toString();
        System.out.println("Appended String: " + appendedString);

        // Perform insertion in message2 at 7th position
        StringBuffer stringBuffer2 = new StringBuffer(message2);
        stringBuffer2.insert(7, "inserted ");
        String insertedString = stringBuffer2.toString();
        System.out.println("String after insertion: " + insertedString);

        // Perform delete from 7th position in both message1 and message2
        StringBuffer stringBuffer3 = new StringBuffer(message1);
        stringBuffer3.delete(7, stringBuffer3.length());
        message1 = stringBuffer3.toString();
        System.out.println("String message1 after deletion: " + message1);

        StringBuffer stringBuffer4 = new StringBuffer(message2);
        stringBuffer4.delete(7, stringBuffer4.length());
        message2 = stringBuffer4.toString();
        System.out.println("String message2 after deletion: " + message2);

        // Reverse message1 string
        StringBuffer stringBuffer5 = new StringBuffer(message1);
        stringBuffer5.reverse();
        String reversedString = stringBuffer5.toString();
        System.out.println("Reversed String message1: " + reversedString);

        // Identify the length of the message2 string
        int lengthOfMessage2 = message2.length();
        System.out.println("Length of message2: " + lengthOfMessage2);
    }
}
