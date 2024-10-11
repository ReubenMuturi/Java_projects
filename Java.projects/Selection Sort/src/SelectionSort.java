public class  SelectionSort {
    public static void main(String[] args) {
        // Selection Sort is a simple sorting algorithm that works by repeatedly selecting the smallest
        // (or largest, depending on the order)
        // element from the unsorted part of the array and swapping it with the first unsorted element.

        // Steps of Selection Sort:
        // Start with the first element and search the entire array to find the smallest element.
        // Swap this smallest element with the first element.
        // Move to the second element and repeat the process for the remaining unsorted part of the array.
        // Repeat the process until the entire array is sorted.

        int[] arr = {64, 25, 12, 22, 11}; //unsorted array

        //Call the selectionSort method
        selectionSort(arr);

        //print the sorted array
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
    //Method for selecting sort
    static void selectionSort(int[] arr) {
        int n = arr.length;

        //Loop through the entire array
        for (int i=0; i<n-1; i++) {
            //Assume the current element is the minimum
            int minIndex = i;

            //Find the smallest element in the remaining unsorted array
            for (int j = i + 1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update the index of the minimum element
                }
            }
            //swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

//Explanation:
//The outer loop starts from the first element and moves through the entire array.
//The inner loop finds the smallest element in the unsorted part of the array.
//The smallest element is swapped with the first unsorted element.
//The process is repeated until the entire array is sorted.
//Time Complexity:
//Worst Case: O(n^2)
//Best Case: O(n^2) (even if the array is already sorted, it still goes through all elements)
