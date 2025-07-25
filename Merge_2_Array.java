import java.util.Arrays;
import java.util.Scanner;

public class Merge_2_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Array1 Size = ");
        int n1=sc.nextInt();
        System.out.println("\n Array1 Values =");
        int [] arr1=new int [n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("\n Array2 Size = ");
        int n2=sc.nextInt();
        System.out.println("\n Array2 Values =");
        int [] arr2=new int [n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }

        System.out.println("\n Initial Array1 =");
        printArray(arr1);
        System.out.println("\n Initial Array2 =");
        printArray(arr2);
        mySolution(arr1,arr2);


    }
    public  static void printArray(int [] arr)
    {
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
    public static void mySolution(int [] a1,int [] a2)
    {
        int n1=a1.length;
        int n2=a2.length;
        int i=n1-1;
        int j=n2-1;
        while(i>=0 && j>=0)
        {
            if(a1[i]>=a2[j])
            {
                int temp=a1[i];
                a1[i]=a2[j];
                a2[j]=temp;
                i--;
                j--;
            }
            else{
                j--;
            }
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println("\n------------------------Solution 1----------------------------");
        System.out.println("\n Sorted arrays =");

        printArray(a1);
        printArray(a2);
        System.out.println("\n Time Complexity =O(N logN)");
        System.out.println("\n Space complexity = O(1)");


    }
}
