import java.util.Arrays;

class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int add = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
        	add += d[i];
        }
        int minus = add - budget;
        if(minus < 0)
        	minus = minus - 2*minus;
        System.out.println(minus);
        while(minus>0) {
        	
        }
        return answer;
    }
}
