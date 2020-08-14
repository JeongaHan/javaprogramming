class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        answer = ((b - a + 1) * (a + b)) / 2;
        return answer;
    }
}
