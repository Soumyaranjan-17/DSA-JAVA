import java.util.Scanner;
public class o5_Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the length of Fibonacci sequence: ");
        // int n = sc.nextInt();

        int n = 10;
        int a = 0, b = 1, c;

        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
        
    }
}
