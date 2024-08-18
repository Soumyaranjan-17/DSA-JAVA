import java.util.Scanner;
public class o5_Ex_1 {

    public static float calculateaverage(int x, int y, int z){
        return (x+y+z)/3;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int a, b, c;
        float avg;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        avg = calculateaverage(a, b, c);
        System.out.println("The average of " + a + ", " + b + " and " + c + "is " + avg);

        sc.close();
    }
}
