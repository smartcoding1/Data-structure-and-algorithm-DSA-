class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length - 1;//low pointer at start and high pointer at the end
        while(lo<=hi){
            int mid = ( lo + hi )/2;
            if((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1])) return mid;//peak found
           
            else if((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid-1])) hi = mid - 1;//peak on the left high index
            else lo = mid + 1;//peak on the right of low index
        }
        return -1;
    }
}
