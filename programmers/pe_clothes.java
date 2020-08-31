class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        for(int i = 0; i < reserve.length; i++) {
        	for(int j = 0; j < lost.length; j++) {
        		System.out.println("reserve : " + i + " , lost : " + j);
        		if(lost[j]==reserve[i]) {
        			if(answer >= n)
    					break;
        			System.out.println(reserve[i] + "가 " + lost[j] + " *");
        			reserve[i] = -1;
        			lost[j]=-1;
        			answer+=1;
       			    break;
        		}
        	}
        }
        for(int i = 0; i < reserve.length; i++) {
        	for(int j = 0; j < lost.length; j++) {
        			if(lost[j]==reserve[i]-1 || lost[j]==reserve[i]+1 ) {
        				if(answer >= n)
        					break;
        				System.out.println(reserve[i] + "가 " + lost[j]);
        				reserve[i] = -1;
        				answer+=1;
        				break;
        			}
        	}
        	
        }
        return answer;
    }
}
