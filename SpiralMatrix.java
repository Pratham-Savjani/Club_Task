import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the n:");
        int n = sc.nextInt();
        int[][] mem = new int[n][n];
        int i = 1;
        int minimumRow, maximumRow, minimumColumn, maximumColumn;
        minimumColumn = minimumRow = 0;
        maximumColumn = maximumRow = n - 1;
        while (i <= (n * n)) {
            for (int j = minimumColumn; j <= maximumColumn; j++)
                mem[minimumRow][j] = i++;
            for (int j = minimumRow + 1; j <= maximumRow; j++)
                mem[j][maximumColumn] = i++;
            for (int j = maximumColumn - 1; j >= minimumColumn; j--)
                mem[maximumRow][j] = i++;
            for (int j = maximumRow - 1; j >= minimumRow + 1; j--)
                mem[j][minimumColumn] = i++;
            minimumColumn++;
            minimumRow++;
            maximumColumn--;
            maximumRow--;
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print("\t" + mem[j][k]);
            }
            System.out.println();
        }
    }
}