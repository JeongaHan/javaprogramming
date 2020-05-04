package mon_thu_study;
import java.util.*;
import java.util.function.*;

class Solution {
    public static int solution(int n) {
    	
    	List<Integer> list = new LinkedList<>();
    	for(int i = 2; i <= n; i++) {
    		boolean check = true;
    		for(int j = 2; j < i; j++) {
    			if(i%j==0) {
    				check = false;
    				break;
    			}
    		}
    		if(check == true) {
    			System.out.println(i);
    			list.add(i);
    		}
    	} 
    	return list.size();  	
//        int answer = 0;
//        for(int i = 2; i <= n; i++) {
//        	boolean flag = true;
//        	for(int j = 2; j < i; j++) {
//        		if(i%j==0) {
//        			flag = false;
//        			break;
//        		}
//        	} 
//        	if(flag==true)
//        	answer++;
//        }


    }
}

public class Test01 {
	public static void main(String[] args) {

		System.out.println(Solution.solution(10));
	}
}