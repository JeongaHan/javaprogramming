class Solution {
    public String solution(int m, int d) {
        int sum = 0;
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i = 0; i < m-1; i++) {
        	sum+=months[i];
        }
        sum+=d-1;
        return week[sum%7];
    }
}
