public class o4_Pattern10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for (int j = 0; j < i; j++) {
                System.out.print((i+j) % 2 + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Bit Approcach
        int bit = 1;
        for (int i = 1; i <= 5; i++) {
            int temp = bit;
            for (int j = 1; j <= i; j++){
                System.out.print(temp + " ");
                temp = (temp-1)*-1;
            }
            bit = (bit-1)*-1;
            System.out.println();
        }
    }
}

// OUTPUT

// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1