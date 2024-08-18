import java.util.Scanner;

public class o5_Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value, countPositive = 0, countNegative = 0, countZero = 0, i;
        System.out.println("Enter the number of items you want to input: ");
        i = sc.nextInt();
        do {
            System.out.println("Enter integer value, (Enter 'Q' to EXIT): " );
            value = sc.nextInt();
                if (value > 0)
                    countPositive++;

                else if (value < 0)
                    countNegative++;
                
                else
                    countZero++;
                
                    i--;
        } while (i > 0);

        System.out.println("Negative : "+ countNegative);
        System.out.println("Positive : "+countPositive);
        System.out.println("Zero : "+countZero);

        sc.close();

    }
}
