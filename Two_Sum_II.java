import java.util.Scanner;
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//Your solution must use only constant extra space.
//
//
//
//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
public class Two_Sum_II {
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
        System.out.println("\n Target Sum= ");
        int target=sc.nextInt();
        System.out.println("\nInitial Array =");
        printArray(arr);
        mySolution(arr,target);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static  void mySolution(int [] arr,int target)
    {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                break;
            }
            if(sum>target)
            {
                right--;
            }
            else{
                left++;
            }
        }
        left+=1;
        right+=1;
        System.out.println("\n Answer= ["+left+" ,"+right+"]");
    }
}
