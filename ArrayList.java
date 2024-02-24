import java.util.ArrayList;

public class ArrayList
 {
    public static void main(String[] args) 
    {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insertion of integer elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Check availability of elements
        boolean containsElement = arrayList.contains(30);
        System.out.println("ArrayList contains 30: " + containsElement);

        // Find the size of ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Return the element for a given index
        int elementAtIndex = arrayList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        // Return the index for a given element
        int indexForElement = arrayList.indexOf(20);
        System.out.println("Index of element 20: " + indexForElement);
    }
}
