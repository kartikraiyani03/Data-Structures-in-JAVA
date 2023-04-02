import java.util.*;
 
public class bubble
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,56,1,34,8,90,23};
        printArray(arr);
        BubbleSort(arr);
        System.out.println(" ");
        printArray(arr);
        
    }
}