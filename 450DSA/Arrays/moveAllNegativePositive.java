public class moveAllNegativePositive {
    // partition process of quicksort approach.
    // TC= O(N)
    // SC= O(1)
    static void arrange(int arr[], int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    // Using Two Pointer Approach
    //TC = O(n)
    //SC= O(1)
    static void arrangeTwo(int[] arr, int left, int right) {
        while (left <= right) {
            // checks if the left/right element are negative
            if (arr[left] < 0 && arr[right] < 0)
                left++;

            // condition to check if the left one is positive and right one is negative
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // if both the elements are positive
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
    }

    // To print the array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Function to print the array
    static void display(int[] arr, int right) {

        // Loop to iterate over the element
        // of the given array
        for (int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int arr[] = { 1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
        int n = arr.length;
        arrangeTwo(arr, 0, n - 1);
        arrange(arr, n);
        System.out.println("Array after rearranging: ");
        printArray(arr, n);
        System.out.print("\n");
        System.out.println("--------------------------");
        System.out.println("Array after rearranging: ");
        display(arr, n - 1);
    }
}
