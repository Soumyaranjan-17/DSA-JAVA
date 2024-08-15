public class o4_Pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // for(int j = 0; j < i; j++) {
            // System.out.print(i + j + " ");
            // }

            for (int j = 1; j < (i + j) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
