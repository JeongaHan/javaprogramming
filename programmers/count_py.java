class Solution {
    boolean solution(String s) {
        boolean answer = false;
		int temp;
		int pCount = 0; 
		int yCount = 0;
		for(int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if((65<=temp)&&(temp<=90)) {
				temp = temp + 32;
			}
			if(temp=='p')
				pCount++;
			if(temp=='y')
				yCount++;
		}
		if(pCount==yCount)
			return true;
		return false;
    }
}
