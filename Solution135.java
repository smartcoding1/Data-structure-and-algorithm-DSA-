public class Solution {
    public int reverseBits(int n) { 

    int res = 0;
	
    for(int i=0;i<32;i++){
	
		//calculate least significant bit
        int lsb = n & 1;
		
		// left shift lsb bit by (31-i) times
        lsb = lsb << (31-i);
		
		// update result by performing OR between result and least significant bit
        res = res | lsb;
		
		// lsb is added to the result, so right shift the number by one
        n = n >> 1;
    }
    return res;
}
}
