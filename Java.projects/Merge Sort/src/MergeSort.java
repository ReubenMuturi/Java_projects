public class MergeSort {
    public static void main(String[] args) {
        // Merge Sort is a more efficient and advanced sorting algorithm that uses the divide and conquer approach.
        // It splits the array into smaller subarrays, sorts them, and then merges them back together.
        //     Steps of Merge Sort:
        // Divide the array into two halves.
        // Recursively sort each half.
        // Merge the two halves together, ensuring that the resulting array is sorted.
        int[] arr = {64, 25, 12, 22, 11};  // Unsorted array

        // Call the mergeSort method
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Recursive method for merge sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two subarrays
    static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays to hold the data
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[] (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[] (if any)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

//Explanation:
//Divide: The array is split into two halves using recursion until each subarray contains one element.
//        Conquer: Each subarray is sorted (since a one-element array is trivially sorted).
//Merge: The sorted subarrays are merged back together to form the final sorted array.
//Time Complexity:
//Worst Case: O(n log n)
//Best Case: O(n log n)
//Space Complexity: O(n) (due to the auxiliary arrays used during merging)

//Which Algorithm to Choose?
//Selection Sort is useful for small arrays and when space is limited since it doesn't require additional memory.
//Merge Sort is much more efficient for larger datasets, especially when time complexity matters.
// It’s also stable, meaning it preserves the order of equal elements.
//
