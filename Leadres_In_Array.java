import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leadres_In_Array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("\n Array Size =");
    int n=sc.nextInt();
    int arr []= new int [n];
    System.out.println("\n Array Value =");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("\n Initial Array =");
    printArray(arr);
    bruteForceApproach(arr);
    optimalSolution(arr);

    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static  void  optimalSolution(int [] a)
    {
        int n=a.length;
        int previousGraterElement=a[n-1];
        List<Integer> result=new ArrayList<>();
        result.add(a[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>previousGraterElement)
            {
                result.add(a[i]);
                previousGraterElement=a[i];
            }
        }
        System.out.println("\n-----------------Optimal Solution -----------------------");
        System.out.println("\n leaders Are =");
        System.out.println(result);
        System.out.println("\n Time Complexity=O(N) ");
        System.out.println("\n Space Complexity =O(1) ");
        System.out.println("\n List is used for store the result so it is ignored ");
    }
    public static  void bruteForceApproach(int a[])
    {
        List<Integer> result=new ArrayList<>();
        int n=a.length;
        boolean leader=false;
        for(int i=0;i<n-1;i++)
        {
            leader=true;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>a[i])
                {
                    leader=false;
                    break;
                }
            }
            if(leader)
                result.add(a[i]);

        }
        result.add(a[n-1]);
        System.out.println("\n-----------------BruteForce Solution -----------------------");
        System.out.println("\n leaders Are =");
        System.out.println(result);
        System.out.println("\n Time Complexity=O(N^2) ");
        System.out.println("\n Space Complexity =O(1) ");

    }

}
