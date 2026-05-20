package Array;

import java.util.Scanner;

public class Insertion {

    public static void Insertion(int[] arr, int val, int position) {
        int len = arr.length;
        if (arr[len - 1] != 0) {
            System.out.println("Array is already full");
            return;
        }
        int place = arr[position];
        for (int i = position; i < len-1; i++) {
            int next = arr[i + 1];
            arr[i + 1] = place;
            place = next;
        }
        arr[position] = val;
    }

    public static int deletion(int[] arr, int position) {
        for (int i = position+1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter len of array : ");
        int len = sc.nextInt();
        int array[] = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        print(array);
        Insertion(array,70,2);
        print(array);
        deletion(array, 2);
        print(array);
         Insertion(array,70,2);
        print(array);
        deletion(array, 2);
        print(array);
    }

    public static void print(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "  ");
        }
        System.out.println();
    }
}
