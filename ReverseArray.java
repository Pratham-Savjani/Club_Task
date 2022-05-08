import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        if (n == 0) {
            System.err.println("Can't reverse empty array");
            System.exit(0);
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = n;
        if (n % 2 == 0)
            n = n - 1;
        int temp = 0;
        for (int i = 0, j = m - 1; i <= n / 2; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("The reversed array is:[");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("\b]");
    }
}