class Solution {
    public int[] diStringMatch(String s) {
        int max = s.length(), min = 0;
        int [] perm = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'I'){
                perm[i] = min;
                min = min + 1;
            }
            else{
                perm[i] = max;
                max = max - 1;
            }
        }
        if (s.charAt(s.length()-1) == 'I')
            perm[s.length()] = max;
        else
            perm[s.length()] = min;
        return perm;
    }
}
