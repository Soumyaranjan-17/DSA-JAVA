public class o4_Pattern_4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // to print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // to print star
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// OUTPUT

// *
// **
// ***
// ****
// *****