//27 - 3 exercise
package hotblood_java;

import java.util.function.BiPredicate;

public class Test04 {

	public static void main(String[] args) {
		BiPredicate<String, Integer> conv = (s, i) -> s.length()>i;
		
		if(conv.test("Robot", 3))
			System.out.println("���ڿ� ���� 3 �ʰ�");
		else
			System.out.println("���ڿ� ���� 3 ����");
		
		if(conv.test("Box", 5))
			System.out.println("���ڿ� ���� 5 �ʰ�");
		else
			System.out.println("���ڿ� ���� 5 ����");

	}

}
