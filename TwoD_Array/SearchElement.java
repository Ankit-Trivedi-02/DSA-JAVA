/*

Searching for an element x in a matrix.


*/

package TwoD_Array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of matrix row : ");
        int r = sc.nextInt();
        System.out.print("Enter side of matrix column : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter value of " + (i + 1) + " " + (j + 1) + " : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter value you want to find ");
        int val = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (val == matrix[i][j]) {
                    System.out.println("found " + val + " at : " + i + " " + j);
                    break;
                }
            }
        }
    }
}
