import java.util.Scanner;

public class Inverse_Of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("\n Array Array =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nInitial Array =");
        printArray(arr);
        mySolution(arr);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static  void mySolution(int [] a)
    {
        int n=a.length;
        int [] inverse=new int[n];
        for(int i=0;i<n;i++)
        {
            int value=a[i];
            inverse[value]=i;
        }
        System.out.println("\n ----------------Solution --------------------------");
        System.out.println("\n Inverse array =");
        printArray(inverse);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity =O(N) N is used for storing the result not for performing any operation");
    }
}
