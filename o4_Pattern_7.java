public class o4_Pattern_7 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}

// OUTPUT

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
