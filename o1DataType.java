public class o1DataType {
    public static void main(String[] args) {
        byte a = -127;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.0f;
        double f = 6.0;
        char g = 'a';
        boolean h = true;

        System.out.println("Byte: " + a + ", Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + b + ", Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: " + c + ", Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + d + ", Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: " + e + ", Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + f + ", Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Char: " + g + ", Range: " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println("Boolean: " + h + ", Range: " + Boolean.TRUE + " to " + Boolean.FALSE);

        // Primitive data types
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 100000L;
        float floatVar = 10.5f;
        double doubleVar = 20.5;
        boolean boolVar = true;
        char charVar = 'A';

        // Non-primitive data types
        String strVar = "Hello, World!";
        int[] arrVar = { 1, 2, 3, 4, 5 };

        // Printing the values
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("boolVar: " + boolVar);
        System.out.println("charVar: " + charVar);
        System.out.println("strVar: " + strVar);
        System.out.print("arrVar: ");
        for (int num : arrVar) {
            System.out.print(num + " ");
        }

    }

}