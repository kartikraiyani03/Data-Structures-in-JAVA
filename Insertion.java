import java.util.*;
 
public class Insertion
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void InsertionSort(int arr[])
    {
        int element;

         for(int i=1;i<arr.length;i++)
         {
            element = arr[i];
            int j =i-1;

            while(j>=0 && element < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
         }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,56,1,34,8,90,23};
        printArray(arr);
        InsertionSort(arr);
        System.out.println(" ");
        printArray(arr);

    }
}