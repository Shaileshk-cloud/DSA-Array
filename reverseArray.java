import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("\nArray element\n");
        for(int k=0;k<n;k++)
        {
            array[k]=sc.nextInt();
        }
        //logic reverse an array int left=0;
        int left=0;
        int right=array.length-1;
        while(left<right)
        {
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;

        }
        //print the reversed array
        System.out.println("Reversed array \n");
        for(int a:array)
        {
            System.out.println(a+" ");
        }
        System.out.println("Time complexity = O(n)");
        System.out.println("Space complexity = O(1)");
    }
}
