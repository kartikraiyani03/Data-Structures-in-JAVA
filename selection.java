import java.util.*;

public class selection 
{
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSort(int arr[]) 
    {
        int temp;
        int min;

        for (int i = 0; i < arr.length-1; i++) 
        {
            min = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 34, 1, 67, 8, 45, 9, 2 };
        printArray(arr);
        SelectionSort(arr);
        System.out.println("");
        printArray(arr);

    }
}