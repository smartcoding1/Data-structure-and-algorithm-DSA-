class Solution {
	public boolean checkString(String s) {        
		boolean firstB = false;
		for(char ch:s.toCharArray()){
			if(firstB && ch == 'a') return false;
			firstB = ch == 'b';
		}
		return true;
	}
}
