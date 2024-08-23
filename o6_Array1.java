import java.util.Scanner;
public class o6_Array1 {
    public static void main(String[] args) {
        // Creating a array 
        //int[] array1 = new int[5]; //3 way to initialize array
        //int array2[] = new int[5];
        int array3[] = {1, 2, 3, 4, 5};

        // @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int n = sc.nextInt();

        sc.close();

        for (int i = 0; i < array3.length; i++){
            if (array3[i] == n){
                System.out.println("The element at " + i + "th index");
                return;
            }
        }
        System.out.println("Not Found...");
    }
}
