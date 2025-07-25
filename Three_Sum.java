import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("\n Array Values=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("\nInitial Array =");
        printArray(arr);
        optimalSolution(arr);
        optimalSolution2(arr);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static void optimalSolution(int a[])
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        Set<List<Integer>> result=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int target=-1*(a[i]);
            for(int j=i+1;j<n;j++)
            {
                if(hmap.containsKey(target-a[j]))
                {
                    List<Integer> tripplet=Arrays.asList(a[i],a[j],a[hmap.get(target-a[j])]);
                    Collections.sort(tripplet);
                    result.add(tripplet);
                }
                hmap.put(a[j],j);
            }
            hmap.clear();

        }
        System.out.println("-----------------------------Optimal Solution 1 ---------------------------------");
        System.out.println("\n Result =");
        System.out.println(result);
        System.out.println("\n Time Complexity =O(N^2)");
        System.out.println("\n Space Complexity = O(N^2)");
    }
    public static void optimalSolution2(int a[] )
    {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        int target=0;
        int left=0;
        int right=n-1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1])continue;
            left=i+1;
            right=n-1;
            sum=0;
            while(left<right)
            {
                sum=a[i]+a[left]+a[right];
                if(sum==0)
                {
                    result.add(Arrays.asList(a[i],a[left],a[right]));

                    while(left<right && a[left]==a[left+1])
                    {
                        left++;
                    }
                    while(left<right && a[right]==a[right-1])
                    {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum>0)
                {
                    right--;
                }
                else{
                    left++;
                }
            }

        }
        System.out.println("\n---------------------------- Optimal Solution 2--------------------------------");
        System.out.println("\n Result =");
        System.out.println(result);
        System.out.println("\n Time Complexity =O(N^2)");
        System.out.println("\n Space Complexity = O(1)");
    }
}
