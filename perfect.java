import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.print("Enter any Number");
        Scanner t = new Scanner(System.in);
        n = t.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum)

            System.out.print("Yes"); // if perfect number then print yes othrwise no

        else {
            System.out.print("No");
        }
    }
}
