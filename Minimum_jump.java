import java.util.Scanner;

public class Minimum_jump {
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
        System.out.println("\nInitial Array =");
        printArray(arr);
        greedyApproach(arr);
    }
    public static void printArray(int [] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void greedyApproach(int [] arr )
    {
        if(arr[0]==0) {
            System.out.println("\n Minimum Jump = -1");
            System.exit(0);
        }

        int jump=1;
        int steps=arr[0];
        int maxReach=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(i==arr.length-1)
                System.out.println("\n Minimum Jump = "+jump);
            steps=steps-1;
            maxReach=Math.max(maxReach,i+arr[i]);
            if(steps==0)
            {
                jump++;
                steps=maxReach-i;
                if(steps<=0)
                {
                    System.out.println("\n Minimum Jump = -1");
                    break;
                }
            }
        }
    }
}
