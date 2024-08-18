import java.util.Scanner;
public class o5_Ex_2 {
    public static int sumOfOdd(int n){
        int sum = 0;
        for (int i = 1; i <= n; i+=2){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the range to calculate the sum of odd numbers: ");
        int n = sc.nextInt();

        System.out.println("The sum of odd numbers upto "+ n+ "is "+ sumOfOdd(n));
        
        sc.close();
    }
}
