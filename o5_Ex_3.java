public class o5_Ex_3 {
    public static float max(float a, float b) {
        if (a > b)
            return a;
        else
            return b;
    }    

    public static void main(String[] args) {
        float a = 45.2f;
        float b = 23.7f;

        System.out.println("the greater number is " + max(a, b));

    }
}
