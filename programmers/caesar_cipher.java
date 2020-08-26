class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        		if(c==32) {//공백
        			answer += c;
        			continue;
        		}
        		else if(c>=97 && c<=122) {//소문자
        			c += n;
        			while(c<97) 
        				c+=26;
        			while(c>122)
        				c-=26;
        			answer += c;
        		}
        		else {//대문자
        			c += n;
        			while(c<65)
        				c+=26;
        			while(c>90)
        				c-=26;
        			answer += c;
        		}
        } 
        return answer;
    }
}
