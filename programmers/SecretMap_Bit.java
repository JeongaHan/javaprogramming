class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		String check;

		for(int i = 0; i < answer.length; i++)
			answer[i] = "";
		
		for(int i = 0; i < n; i++) {
			check = Integer.toBinaryString(arr1[i]|arr2[i]);
			int m = n - check.length();
			if(m > 0) {
				for(int j = 0; j < m; j++)
					check = "0" + check;
			}
			for(int j = 0; j < check.length(); j++) {
				answer[i] += (check.charAt(j)=='0')?" ":"#";
			}
		}

		return answer;
    }
}
