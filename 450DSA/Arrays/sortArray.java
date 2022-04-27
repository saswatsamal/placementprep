class sortArray {
    public static void SortArray(int[] a, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp = 0;
        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}