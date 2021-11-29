class Solution {
    public String reverseStr(String s, int k) {
        
        char[] ch = s.toCharArray();
        final int len = ch.length;
		
        for(int index = 0 ; index < len ; index += k << 1) // index += k << 1 ==> index = index + k * 2, but use bit operator for faster execution
            reverse(ch, index, Math.min(index + k - 1, len - 1)); // Math.min(index + k - 1, len - 1) ; take end index of whichever is lesser; explained above
        
        return new String(ch);
    }
    
    void reverse(char[] ch, int start, int end){
        
        char temp;
        
        while(start < end){
            temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
    }        
}
