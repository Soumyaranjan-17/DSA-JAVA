import java.util.Scanner;

public class o5_Function_1 {

    public static String input(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String data = sc.nextLine();
        sc.close();
        
        return data;
    }

    public static void displayName(String name) {
        System.out.print("My name is "+ name);
    }
    public static void main(String[] args) {
        String name = input("Enter your name: ");
        displayName(name);
    }
}
