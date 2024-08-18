public class o5_Ex_6 {

    public static int gcd(int a, int b) { 
        if (b == 0) return a;

        int r = a % b;
        while (r != 0){
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }

    public static void main(String[] args) {
        int a = 100; 
        int b = 0;

        int gcd = gcd(a, b);
        System.out.println(gcd);
    }
}
