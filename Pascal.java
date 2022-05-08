import java.util.Scanner;

public class Pascal {

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void main(String[] args) {
        boolean k;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            count = 0;
            k = true;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i && k) {
                    System.out.print(nCr(i - 1, count));
                    count++;
                    k = false;
                } else {
                    System.out.print(" ");
                    k = true;
                }
            }
            System.out.println();
        }
    }
}