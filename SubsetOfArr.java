import java.util.Scanner;
public class SubsetOfArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Ø");
            System.exit(0);
        }
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Ø,");
        int numElements=(int)Math.pow(2, n);
        for(int i=1;i<numElements;i++){
            int[] a=new int[n];
            int temp=i;
            for(int j=n-1;temp!=0;j--){
                a[j]=temp%2;
                temp=temp/2;
            }
            System.out.print("[");
            for(int j=0;j<n;j++){
                if(a[j]==1){
                    System.out.print(arr[j]+",");
                }
            }
            System.out.print("\b],");
        }
        System.out.println("\b ");
    }
}