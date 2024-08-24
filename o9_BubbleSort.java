public class o9_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 12, 4, 99, 23};

        // for(int i = 0; i < arr.length - 1; i++){ //0 1 2 3
        //     for(int j = 0; j < arr.length - i - 1;  j++){
        //         if(arr[j] > arr[j + 1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("The shorted array is [");
        for(int i = 0; i < arr.length; i++){
            if (i == arr.length-1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");


        // if(arr[0] > arr[1]){
        //     swap(arr[0], arr[1]);
        // }
    }
}
