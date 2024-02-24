import java.util.HashSet;
import java.util.Iterator;

public class HashSet 
{
    public static void main(String[] args) 
    {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Insertion of string elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        // Check availability of elements and print using iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.println("Elements in the HashSet:");
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }

        // Find the size of HashSet
        int size = hashSet.size();
        System.out.println("Size of the HashSet: " + size);

        // Find the hash code of the HashSet
        int hashCode = hashSet.hashCode();
        System.out.println("Hash code of the HashSet: " + hashCode);

        // Remove an element from the HashSet
        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        // Clone the HashSet to another HashSet object
        HashSet<String> clonedHashSet = (HashSet<String>) hashSet.clone();
        System.out.println("Cloned HashSet: " + clonedHashSet);
    }
}
