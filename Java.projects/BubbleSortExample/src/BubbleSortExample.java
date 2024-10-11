// Great! Let's start with sorting algorithms as a foundational problem-solving technique.
// Sorting is widely used in many applications, such as searching, organizing data, and optimizing performance.
// We will begin with a common algorithm, Bubble Sort, and explain how it works step by step.

// Bubble Sort
// It is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.
//
// Steps of Bubble Sort:
// Compare the first two elements.
// If the first element is greater than the second, swap them.
// Move to the next pair (second and third elements), and repeat the process.
// Continue this until the last element.
// Repeat the process from the beginning, excluding the last sorted elements, until no swaps are needed.



public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 90, 22, 11, 12}; // Unsorted array

        // Call the bubbleSort method
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.println(i + " ");

        }
    }

    // Method for babble sort
    static void  bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++ ) {
                // Compare the elements and swap if needed
                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}


//Step-by-Step Explanation:
//Initial Array: {64, 34, 25, 12, 22, 11, 90}
//
//In the first iteration, the algorithm compares each adjacent pair, and swaps where necessary. For example, it compares 64 and 34, and since 64 is greater than 34, they are swapped.
//First Pass:
//
//After the first full pass, the largest number (90) will be at the end. The array looks like: {34, 25, 12, 22, 11, 64, 90}.
//Subsequent Passes:
//
//The process repeats, each time excluding the last sorted element. In the second pass, the next largest number (64) is placed in its correct position.
//Final Sorted Array:
//
//After multiple passes, the entire array is sorted: {11, 12, 22, 25, 34, 64, 90}.
//Time Complexity:
//Worst Case: O(n^2) – when the array is in reverse order.
//Best Case: O(n) – when the array is already sorted.

