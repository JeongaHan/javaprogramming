class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        for(int i = 0; i < reserve.length; i++) {
        	for(int j = 0; j < lost.length; j++) {
        		if(lost[j]==reserve[i]) {
        			reserve[i] = 0;
        			answer+=1;
                    break;
        		}else if(lost[j]+1!=reserve[i]) {
        			if(lost[j]==reserve[i]-1||lost[j]==reserve[i]+1) {
        				reserve[i] = 0;
        				answer+=1;
                        break;
        			}
        		}
        	}
        }
        return answer;
    }
}
