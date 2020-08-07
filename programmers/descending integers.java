import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        int num = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n!=0) {
        	num = (int) (n%10);
        	list.add(num);
        	n/=10;
        }
        Collections.sort(list,Collections.reverseOrder());
        int exp = list.size()-1; 
        for(int i = 0; i < list.size(); i++) {
        	answer += list.get(i)*Math.pow(10, exp--);
        }
        return answer;
    }
}
