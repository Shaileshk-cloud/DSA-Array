import java.util.Scanner;

public class Merge_1_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Array1 Size = ");
        int n1=sc.nextInt();
        System.out.println("\n LENGTH of First Non zero elements =");
        int k=sc.nextInt();
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
        mergeArray(arr1,k,arr2,n2);
    }
    public  static void printArray(int [] arr)
    {
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
    public static void mergeArray(int [] a1,int m,int [] a2,int n)
    {
        int a1Pointer=m-1;
        int a2pointer=n-1;
        int k=a1.length-1;
        while(a2pointer>=0 && a1Pointer>=0)
        {
          if(a1[a1Pointer]>a2[a2pointer])
          {
              a1[k]=a1[a1Pointer];
              a1Pointer--;

          }
          else{
              a1[k]=a2[a2pointer];
              a2pointer--;
          }
          k--;
        }
        while(a2pointer>=0)
        {
            a1[k--]=a2[a2pointer--];
        }
        System.out.println("\n Result =");
        printArray(a1);
    }
}
