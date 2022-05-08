import java.util.Scanner;

public class FiboQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the starting point:");
        int n = sc.nextInt();
        System.out.print("First 5 terms of fibonnaci series:");
        int count = 1;
        while (true) {
            if (t1 >= n) {
                System.out.print(t1 + " ");
                count++;
            }
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            if (count > 5)
                break;
        }
    }
}