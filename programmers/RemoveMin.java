import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
            if(arr.length==1) {
	    		int[] answer = {-1};
	    		return answer;
	    	}
	        int [] arr2 = new int[arr.length];
	        for(int i = 0; i < arr2.length; i++)
	        	arr2[i] = arr[i];
	        Arrays.sort(arr2);
	        int min = arr2[0];
	        List<Integer> list = new ArrayList();
	        for(int i = 0; i < arr.length;i++) {
	        	if(arr[i]!=min) {
	        		list.add(arr[i]);
	        	}
	        }
	        int[] answer = new int[list.size()];
	        for(int i=0; i < list.size(); i++) {
	        	answer[i] = list.get(i);
	        }
	        for(int i : answer)
	        	System.out.println(i);
	        return answer;
    }
}
