import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new LinkedList<>();
        for(int a : arr)
        	if(a%divisor == 0)
        		list.add(a);
        int cnt = 0;
        if(list.size()<1) {
        	int[] ans = {-1};
        	return ans;
        }
        int[] answer = new int[list.size()];
        for(int a : list) {
        	answer[cnt++] = a;
        }
        Arrays.sort(answer);
        return answer;
    }
}
