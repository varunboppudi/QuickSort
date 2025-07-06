import java.util.Scanner;

public class QuickSorting {
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partition=qfunc(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }
    public static int qfunc(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j) {
            while(arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while(arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i<j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

//
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickSort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
