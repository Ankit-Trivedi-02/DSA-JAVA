import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You choosed option 1 ");
                break;
            case 2:
                System.out.println("You choosed option 2 ");
                break;
            case 3:
                System.out.println("You choosed option 3 ");
                break;
            case 4:
                System.out.println("You choosed option 4 ");
                break;
            default:
                System.out.println("You choosed none of 1 - 4 ");
        }
    }
}
