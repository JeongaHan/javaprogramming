
class MyException extends Exception{
	public MyException() {
		super("���� ����ó���Դϴ�.");//���� Ŭ������ �������� �޽����� �ʱ�ȭ��.
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