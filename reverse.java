import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class reverse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int reva = reverse(a);
            int revb = reverse(b);
            int result = reverse(reva + revb);
            System.out.println(result);
        }
        in.close();
    }

    public static int reverse(int a) {
        int reverse = 0;
        while (a > 0) {
            int d = a % 10;
            reverse = reverse * 10 + d;
            a = a / 10;
        }
        return reverse;
    }
}