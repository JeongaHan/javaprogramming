
public class Test10 {

	public static void main(String[] args) {
		try {
//			int a = 3;
//			int b = 0;
//			int c = a/b;
			int[] a = new int[5];
			a[10] = 0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());	
			
		}catch(ArithmeticException e) {// ArithmeticException e = new ArithmeticExeption();
			System.out.println("0���� ���������ϴ�.");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception");
		}

	}

}
