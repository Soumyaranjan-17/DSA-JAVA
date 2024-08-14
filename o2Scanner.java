import java.util.Scanner;
public class o2Scanner {
    public static void main(String[] args){
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();

        c = a+b;

        System.out.println("Sum of " + a + " and " + b + " = " + c);
        // sc.close();
    }
}
