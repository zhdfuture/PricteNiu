import java.util.Scanner;
import java.util.Stack;

public class BottleChanging {
    int count = 0;

    public int Count(int n) {
        if (n < 2) {
            return -1;
        } else {
            count++;
            Count(n - 2);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input:");
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            BottleChanging b = new BottleChanging();
            System.out.println(b.Count(n));
        }
    }
}

