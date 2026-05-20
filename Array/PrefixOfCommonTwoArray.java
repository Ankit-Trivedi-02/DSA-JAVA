package Array;

public class PrefixOfCommonTwoArray {
    public static void print(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "  ");
        }
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int l = A.length;
        int[] freqA = new int[l + 1];
        int[] freqB = new int[l + 1];
        int[] res = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Checking after round  " + (i + 1));
            freqA[A[i]]++;
            freqB[B[i]]++;
            print(freqA);
            System.out.println();
            print(freqB);
            System.out.println();
            int val = checkForCommon(freqA, freqB);
            System.out.println("Result after round  " + (val));
        }
        return res;
    }

    public static int checkForCommon(int[] A, int[] B) {
        int freq = 0;
        System.out.println();
        System.out.println("Loop running to find common");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + "  ==  " + B[i] + " == 1");
            if (A[i] == B[i] && A[i] == 1) {
                freq++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
        int[] arr2 = { 3, 1, 2, 4 };
        int[] res = findThePrefixCommonArray(arr, arr2);
    }
}
