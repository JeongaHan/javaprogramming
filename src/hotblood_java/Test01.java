//27 - 1 exercise
package hotblood_java;

interface Calculate<T>{
	T cal(T a, T b);
}

class CalculatorDemo{
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1,n2);
		System.out.println(r);
	}
}
public class Test01 {
	public static void main(String[] args) {
//		CalculatorDemo ci = new CalculatorDemo();
//		CalculatorDemo cd = new CalculatorDemo();
		CalculatorDemo.calAndShow((a,b) -> a + b, 3, 4);
		CalculatorDemo.calAndShow((a,b) -> a + b, 2.5, 7.1);
		CalculatorDemo.calAndShow((a,b) -> a - b, 4, 2);
		CalculatorDemo.calAndShow((a,b) -> a - b, 4.9, 3.2);
		
//		Calculate<Integer> c1 = (a,b) -> a + b;
//		Calculate<Double> c2 = (a,b) -> a + b;
//		Calculate<Integer> c3 = (a,b) -> a - b;
//		Calculate<Double> c4 = (a,b) -> a - b;
//		ci.calAndShow(c1, 3, 4);
//		cd.calAndShow(c2, 3, 4);
//		ci.calAndShow(c3, 3, 4);
//		cd.calAndShow(c4, 3, 4);
	}
}
