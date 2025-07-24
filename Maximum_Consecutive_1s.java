import java.util.Scanner;

public class Maximum_Consecutive_1s {
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
        naiveApproach(arr);
        optimalSolution(arr);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static  void naiveApproach(int [] a)
    {
        int n=a.length;
        int maxCount=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                for(int j=i;j<n;j++)
                {
                    if(a[j]==0)
                    {
                        maxCount=Math.max(maxCount,j-i);
                        break;
                    }
                }
            }
        }
        System.out.println("\n --------------------Naive Approach ---------------------");
        System.out.println("\n Maximum consecutive 1's = "+maxCount);
        System.out.println("\n Time Complexity = O(N^2)");
        System.out.println("\n Space Complexity = O(1)");
    }
    public static  void optimalSolution(int [] a)
    {
        int left=0;
        int right=0;
        int n=a.length;
        int maxCount=0;
        while(right<n) {
            if (a[right] != 0) {
                left = right;
                while (right < n && a[right] != 0) {
                    maxCount = Math.max(maxCount, right - left + 1);
                    right++;
                }
            }
            right++;
        }
        System.out.println("\n --------------------Optimal Solution---------------------");
        System.out.println("\n Maximum consecutive 1's = "+maxCount);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity = O(1)");
    }
}
