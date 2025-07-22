import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Union_and_Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array1 size:");
        int n1=sc.nextInt();
        int []   arr1=new int[n1];
        System.out.println("\nArray1 element :\n");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Array2 size:");
        int n2=sc.nextInt();
        int []   arr2=new int[n2];
        System.out.println("\nArray2 element :\n");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("\nInitial array1 = ");
        printArray(arr1);
        System.out.println("\nInitial array2 = ");
        printArray(arr2);
        union(arr1,arr2);
        intersection(arr1,arr2);
    }
    public static void printArray(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void union(int a1[],int a2[])
    {
        int n1=a1.length;
        int n2=a2.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            hs.add(a1[i]);
        }
        for(int i=0;i<n2;i++)
        {
            hs.add(a2[i]);
        }
        System.out.println("\nUnion = ");
        System.out.println(hs);

    }
    public static void intersection(int a1[],int [] a2)
    {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a1.length;i++)
        {
            hs.add(a1[i]);
        }
        for(int i=0;i<a2.length;i++)
        {
            if(hs.contains(a2[i]))
            {
                list.add(a2[i]);
            }
        }
        System.out.println("\n Intersection =");
        System.out.println(list);
    }
}
