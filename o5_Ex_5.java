public class o5_Ex_5 {
    public static double power(int base, int exponent){
        double result = 1; // Initialize result to 1
        while (exponent > 0) {
            if (exponent % 2 != 0) { // If the exponent is odd
                result *= base; // Multiply the result by the base
            }
            base *= base; // Square the base
            exponent /= 2; // Divide the exponent by 2
        }
        return result;
    }
    public static void main(String[] args) {
        int b = 2;
        int e = 0;
        System.out.println(b + " ** " + e + " = " + power(b, e));
    }
}
