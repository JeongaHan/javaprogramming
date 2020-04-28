
class MyException extends Exception{
	public MyException() {
		super("나의 예외처리입니다.");//상위 클래스의 생성자의 메시지가 초기화됨.
	}
}
public class Test12 {

	public static void main(String[] args) {
		int n = 3;
		if(n==3) {
			try {
				throw new MyException();
			} catch (MyException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
	}
}