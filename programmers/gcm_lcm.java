class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = 1;
        for(int i = n; i >= 2; i--) {
        	if(n%i==0 && m%i==0) {
        		answer[0] = i;
        		break;
        	}
        }
        int temp = n;
        while(true) {
        	if(temp%m==0) {
        		answer[1] = temp;
        		break;
        	}
        	temp += n;
        }
        return answer;
    }
}
