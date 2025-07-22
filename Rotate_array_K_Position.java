import java.util.Scanner;

public class Rotate_array_K_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        int []   arr=new int[n];
        System.out.println("\nArray element\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("K = ");
        int k=sc.nextInt();

        System.out.println("\nInitial array ");
        printArray(arr);
        rotateArrayRight(arr,k);
        rotateArrayLeft(arr,k);

    }
    public static void printArray(int [] arr)
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void rotateArrayRight(int [] arr,int k)
    {
        int n=arr.length;
        reverse(arr,0,n-k);
        reverse(arr,n-k,n);
        reverse(arr,0,n);
        System.out.println("\n After "+k+" Right Rotation = ");
        printArray(arr);

    }
    public static void reverse(int [] arr ,int left,int right)
    {
        int low =left;
        int high=right-1;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
    public static void rotateArrayLeft(int [] arr,int k)
    {
        int n=arr.length;
        reverse(arr,0,k);
        reverse(arr,k,n);
        reverse(arr,0,n);
        System.out.println("\n After "+k+" Left Rotation = ");
        printArray(arr);
    }
}
