public class InsertionSort {
    /*Function to sort array using insertion sort*/
    public static int [] sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
 
 
    // Driver method
    public static void main(String args[])
    {
        int x[]= sort(new int[]{4,3,1,5,0,8});
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
}
