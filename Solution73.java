class Solution {
    public int largestAltitude(int[] gain) {
        
        int result = 0;
        int altitude = 0;
        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            result = Math.max(result, altitude);
        }
        return result;
    }
}
