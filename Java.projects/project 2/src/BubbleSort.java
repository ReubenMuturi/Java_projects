public class BubbleSort {
    public static void main(String[] arg) {

        //  Sorting algorithms as a foundational problem-solving technique.
        //  Sorting is widely used in many applications, such as searching, organizing data, and optimizing performance.
        //  We will begin with a common algorithm, Bubble Sort, and explain how it works step by step.

        // Bubble Sort
        // It is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
        // The pass through the list is repeated until the list is sorted.

        //    Steps of Bubble Sort:
        //    Compare the first two elements.
        //    If the first element is greater than the second, swap them.
        //    Move to the next pair (second and third elements) and repeat the process.
        //    Continue this until the last element.
        //    Repeat the process from the beginning, excluding the last sorted elements, until no swaps are needed.

        int[] arr = {64, 34, 25, 90, 22, 11, 12}; // Unsorted array

        // Call the bubbleSort method
        bubbleSort(arr);
        System.out.println("Sorted array"); // Print the sorted array
        for (int i : arr) {
            System.out.print(i + ", " );
        }
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
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