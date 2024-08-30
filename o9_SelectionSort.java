public class o9_SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 23, 56, 12, 8, 15, 34 }; // len = 6

        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4 5
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println("Swapping the index: " + i + " " + min );

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        System.out.println("Final sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
