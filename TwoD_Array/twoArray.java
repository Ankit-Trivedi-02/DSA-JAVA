/*

Just a demo to show how to initialize a 2D array and print it

*/

package TwoD_Array;

public class twoArray {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
