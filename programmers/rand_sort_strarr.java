import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] letter = new char[strings.length];
        Arrays.sort(strings);
        for(int i = 0; i < strings.length; i++) {
        	letter[i] = strings[i].charAt(n);
        }
        Arrays.sort(letter);
        for(int i = 0; i < letter.length; i++) {
        	for(int j = 0; j < strings.length; j++) {
        		System.out.println(letter[i] + " " + strings[j]);
        		if(letter[i]==strings[j].charAt(n)) {
        			System.out.println(" *** ");
        			answer[i] = strings[j];
        			strings[j] = "---------------------------------------------------------------------------------------------------";
        			break;
        		}
        	}
        }
        return answer;
    }
}
