public class Solution {
    public int[] solve(int[] A) {
    int i, j, n = A.length;
		int min = 0, idx = -1;
		int ans[] = new int[n - 1];
		for (i = 0; i < n - 1; i++) {
			idx = -1;
			min = Integer.MAX_VALUE;
			for (j = i; j < n; j++) {
				if (min > A[j]) {
					min = A[j];
					idx = j;
				}
			}
			ans[i] = idx;
			A[i] = (A[i] + A[idx]) - (A[idx] = A[i]);
		}
		return ans;    
    }
}
