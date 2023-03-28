import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = { 10, 20, 30, 40 };

        // Display the initial array
        System.out.println("Initial Array:");
        displayArray(arr);

        // Insertion operation
        arr = insertElement(arr, 50, 2);
        System.out.println("After Insertion:");
        displayArray(arr);

        // Deletion operation
        arr = deleteElement(arr, 2);
        System.out.println("After Deletion:");
        displayArray(arr);

        // Searching operation
        int index = searchElement(arr, 30);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        // Updation operation
        arr = updateElement(arr, 1, 60);
        System.out.println("After Updation:");
        displayArray(arr);
    }

    // Method to display an array
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to insert an element in an array
    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }

    // Method to delete an element from an array
    public static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    // Method to search for an element in an array
    public static int searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Method to update an element in an array
    public static int[] updateElement(int[] arr, int index, int element) {
        arr[index] = element;
        return arr;
    }
}