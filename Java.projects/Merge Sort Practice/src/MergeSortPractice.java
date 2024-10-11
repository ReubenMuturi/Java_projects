public class MergeSortPractice {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 8, 9, 1, 4};  // Unsorted array
        //call the mergeSort method
        mergesort(arr, 0, arr.length - 1);

        //print the sorted array
        System.out.println("sorted array");
        for (int i : arr) {
            System.out.println(i + ", ");
        }
    }
    //Recursive method for merge sort
    static void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            //Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort the two halves
            mergesort(arr, left, mid);
            mergesort(arr, mid +1, right);

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
        for (int j=0; j< n2; j++) {
            R[j] = arr[mid+1+j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j=0;
        int k = left;
        while (i< n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }else {
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
