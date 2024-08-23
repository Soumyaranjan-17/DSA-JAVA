public class o6_Array2 {
    public static void main(String[] args) {
        // 2D ARRAY

        // int Array2D[][] = new int[2][3]; 
        int Array2D[][] = {{1,2,3,4}, {4,5,6}, {7,8,9}};

        // System.out.println(Array2D[0].length);

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                System.out.print(Array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
