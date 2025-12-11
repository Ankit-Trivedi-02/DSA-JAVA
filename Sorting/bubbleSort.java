/*

WAP to sort an array using bubble sort

*/

package Sorting;

import java.util.*;

class bubbleSort{

    public static void print(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+"  ");
        }
        System.out.println();
    }
public static void main(String[] args) {
    int[] marks={10,50,30,40,5,8,2};
    int temp;
    for (int i = 0; i < marks.length-1; i++) {
        for (int j = 0; j < marks.length-1-i; j++) {
            if(marks[j]>marks[j+1]){
                temp=marks[j];
                marks[j]=marks[j+1];
                marks[j+1]=temp;
            }   
        }
        print(marks);
        System.out.println(i);
    }
    System.out.println("Hello");
}
}