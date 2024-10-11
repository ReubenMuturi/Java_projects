// Problem:
// You are given an array of integers: [29, 10, 14, 37, 13].
// Sort the array in ascending order using Selection Sort.

public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        selectionPractice(arr);

        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
    static void selectionPractice(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}