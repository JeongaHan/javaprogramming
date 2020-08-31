import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 1;
        for(int i=1; i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
               count++;
            }
        }
        int[] answer = new int[count];
        answer[0]=arr[0];
        int cnt=1;
        for(int i=1; i<arr.length;i++) {
        	if(arr[i-1]!=arr[i]){
        		answer[cnt++] = arr[i];
        	}
        }

        return answer;
    }
}
