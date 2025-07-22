import java.util.Scanner;

public class Min_Max_In_Array {
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

        //logic to find minimum and max in array
        int min=array[0];
        int max=array[0];
        for(int i=1;i<n;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }
        }

        System.out.println("Minimum element = "+min);
        System.out.println("Maximum element = "+max);



        //time and space
        System.out.println("Time complexity = O(n)");
        System.out.println("Space complexity = O(1)");
    }
}
