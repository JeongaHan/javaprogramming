class Solution {
    public static String solution(String s) {
        String answer = "";
        char [] arr = s.toCharArray();
        boolean isOdd = true;
        for(int i = 0 ; i < arr.length; i++) {
        	if(arr[i]!=' ') {
        		if(isOdd==true) {
        			if(arr[i]>=97&&arr[i]<=122) {
        				arr[i] = (char) (arr[i]-32);
        			}
        			isOdd&=false;
        		}
        		else if(isOdd==false) {
        			if(arr[i]>=65&&arr[i]<=90) {
        				arr[i] = (char) (arr[i]+32);
        			}
        			isOdd|=true;
        		}
        	}
        	else if(arr[i]==' '){
        		isOdd|=true;
        	}
        }
        
        for (char i : arr) {
        	answer += i;
        }
        
        return answer;
    }
}
