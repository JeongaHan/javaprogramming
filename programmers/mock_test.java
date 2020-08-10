class Solution {
    public int[] solution(int[] answers) {
        //수포자1,2,3의 답안지 배열
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        //수포자1,2,3의 점수 배열
        int[] score = {0,0,0};
        //채점하고 점수 저장
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == stu1[i%5]) {
        		score[0]++;
        	}
        	if(answers[i] == stu2[i%8]) {
        		score[1]++;
        	}
        	if(answers[i] == stu3[i%10]) {
        		score[2]++;
        	}
        }
        //최고점수 저장
        int max = 0;
        for(int i = 0; i < score.length; i++) {
        	if(score[i] > max) {
        		max = score[i];
        	}
        }
        //배열의 길이는 최고점수를 받은 동점자의 수 
        int tie = 0;
        for(int i = 0; i<score.length;i++) {
        	if(max==score[i]) {
        		tie++;
        	}
        }
        int[] answer = new int[tie];
        //수포자의 점수가 최대이면 answer 배열에 저장
        int count = 0;
        if(max==score[0]) {
        	answer[count++] = 1;
        }
        if(max==score[1]) {
        	answer[count++] = 2;
        }
        if(max==score[2]) {
        	answer[count++] = 3;
        }
        return answer;
    }
}
