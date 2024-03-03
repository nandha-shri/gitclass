import.java.io.*;
public static boolean isPowerOfTwo(int number) 
{
        if(number <=0)
        {
            throw new IllegalArgumentException(number + " is too small.");
        }
        if ((number & -number) == number) 
        {
            return true;
        }
        return false;
    }