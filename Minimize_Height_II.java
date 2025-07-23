import java.util.Arrays;
import java.util.Scanner;

public class Minimize_Height_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Array size = ");
        int n=sc.nextInt();
        System.out.println("Array Elements = ");
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k =");
        int k=sc.nextInt();
        System.out.println("\nInitial Array =");
        System.out.println("\n Brute force Approach is to perform all possible combination for n it leads 2^n time complexity ");
        printArray(arr);
        greedyApproach(arr,k);
    }
    public static void printArray(int [] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static  void greedyApproach(int [] arr,int k)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int min=arr[0]+k;
        arr[0]=min;
        int max=arr[n-1]-k;
        arr[n-1]=max;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]-k>=min)
            {
                arr[i]=arr[i]-k;
            }
            else{
                arr[i]=arr[i]+k;
            }
        }
        System.out.println("\n Result Array =");
        printArray(arr);
        System.out.println("\nMinimum Difference = "+(max-min));
        System.out.println("\n Time Complexity =  O(n log N");
        System.out.println("\n Space Complexity = O(1)");

    }
}
