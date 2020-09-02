class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		int[][] check1 = new int[n][n];
		int[][] check2 = new int[n][n];
		
		for (int i = 0; i < check1.length; i++) {
			for (int j = 0; j < check1[i].length; j++) {
				if (arr1[i] % 2 == 1) {
					check1[i][j] = 1;
				} else {
					check1[i][j] = 0;
				}
				if (arr2[i] % 2 == 1) {
					check2[i][j] = 1;
				} else {
					check2[i][j] = 0;
				}
				arr1[i] = arr1[i] / 2;
				arr2[i] = arr2[i] / 2;
			}
		}
		for(int i = 0; i < answer.length; i++) {
			answer[i] = "";
		}
		for(int i = check1.length-1; i >=0 ; i--) {
			for(int j = check1.length-1; j >=0 ; j--) {
				if(check1[i][j]==0 && check2[i][j]==0) {
					answer[i] += " ";
				}
				else {
					answer[i] += "#";
				}
			}
		}
		return answer;
    }
}
