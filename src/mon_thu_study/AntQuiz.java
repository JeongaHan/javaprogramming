package mon_thu_study;


public class AntQuiz {
	public String ant(String s) {
		//문자열 s를 전달받아서 맨 첫번째 값을 c에 저장한다.
		//맨 첫번째 값 c가 그 다음 값들에도 반복된다면 count를 증가시킨다. count는 c문자가 반복된 횟수이다.
		//만약 c와 다른 값이 등장했다면 문자열에 몇개의 c가 몇번 반복되었는지 저장한다.
		//그리고 다른 값이 새로 등장했으므로 c에 그 값을 저장하고, count를 1로 바꿔준다.
		//이 과정을 문자열의 끝까지 반복한다.
		//문자열의 끝까지 반복했다면 마지막으로 문자열에 c와 c가 반복된 횟수를 더해주고, 그 문자열을 리턴한다.
		String t = "";
		char c = s.charAt(0);
		int count = 1;
		for(int i = 1; i < s.length();i++) {
			if(c==s.charAt(i)){
				count++;
			}else {
				t = t + c + count;
				c = s.charAt(i);
				count=1;
			}
		}
		t = t + c + count;
		return t;
	}
	public void ant(int stage) {
		//2. 처음 수열을 11로 정한다.
		//사용자가 정한 stage만큼 다른 ant 메소드를 반복한다.
		String s = "11";
		for(int i = 0; i<stage; i++) {
			System.out.println(s);
			s=ant(s);
		}
		
	}
	public static void main(String[] args) {
		AntQuiz quiz = new AntQuiz();
		quiz.ant(12);//1. 처음에 개미퀴즈의 수열 개수를 정한다.

	}

}


