class Solution {
    public int smallestRangeI(int[] A, int K) {
        if(A.length == 1)
            return 0;
        // find the min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i] < min)
                min = A[i];
            if(A[i] > max)
                max = A[i];
        }
        return (max - K) - (min + K) <= 0? 0 : ((max - K) - (min + K));
    }
}
