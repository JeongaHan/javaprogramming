package mon_thu_study;


public class AntQuiz {
	public String ant(String s) {
		//���ڿ� s�� ���޹޾Ƽ� �� ù��° ���� c�� �����Ѵ�.
		//�� ù��° �� c�� �� ���� ���鿡�� �ݺ��ȴٸ� count�� ������Ų��. count�� c���ڰ� �ݺ��� Ƚ���̴�.
		//���� c�� �ٸ� ���� �����ߴٸ� ���ڿ��� ��� c�� ��� �ݺ��Ǿ����� �����Ѵ�.
		//�׸��� �ٸ� ���� ���� ���������Ƿ� c�� �� ���� �����ϰ�, count�� 1�� �ٲ��ش�.
		//�� ������ ���ڿ��� ������ �ݺ��Ѵ�.
		//���ڿ��� ������ �ݺ��ߴٸ� ���������� ���ڿ��� c�� c�� �ݺ��� Ƚ���� �����ְ�, �� ���ڿ��� �����Ѵ�.
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
		//2. ó�� ������ 11�� ���Ѵ�.
		//����ڰ� ���� stage��ŭ �ٸ� ant �޼ҵ带 �ݺ��Ѵ�.
		String s = "11";
		for(int i = 0; i<stage; i++) {
			System.out.println(s);
			s=ant(s);
		}
		
	}
	public static void main(String[] args) {
		AntQuiz quiz = new AntQuiz();
		quiz.ant(12);//1. ó���� ���������� ���� ������ ���Ѵ�.

	}

}


