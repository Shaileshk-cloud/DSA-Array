import java.util.Scanner;

public class Unique_In_SortedArray {
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
        printArray(arr,n);
        naiveSolution(arr);
        optimalSolution(arr);
    }
    public static  void printArray(int a[],int n)
    {
       for(int i=0;i<n;i++)
       {
           System.out.print(a[i]+" ");
       }
    }
    public static void naiveSolution(int [] arr)
    {
        int n=arr.length;
        int [] temp=new int [n];
        int j=0;
        int i=1;
        temp[0]=arr[0];
        for(;i<n;i++)
        {
            if(arr[i]!=temp[j])
            {
                j++;
                temp[j]=arr[i];
            }
        }
        System.out.println("\n====================Naive Solution ===========================");
        System.out.println("\n Unique Elements of array =");
        printArray(temp,j+1);
        System.out.println("\n Time Complexity =O(N)");
        System.out.println("\n Space Complexity =O(N)");

    }
    public static void optimalSolution(int [] arr)
    {
        int n=arr.length;
        int j=0;
        int i=1;
        for(;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("\n====================Optimal  Solution ===========================");
        System.out.println("\n Unique Elements of array =");
        printArray(arr,j+1);
        System.out.println("\n Time Complexity =O(N)");
        System.out.println("\n Space Complexity =O(1)");
    }
}
