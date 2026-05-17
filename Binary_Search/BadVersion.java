package Binary_Search;

public class BadVersion {
    public static void main(String[] args) {
        int l = 1, r = 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            System.out.println("left + " + l + " Right : " + r);
            if (isBadVersion(mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("Your result is + " + l);
    }

    public static boolean isBadVersion(int n) {
        return n == 1;
    }
}
