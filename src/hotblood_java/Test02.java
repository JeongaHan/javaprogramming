////27 - 2 exercise
package hotblood_java;
import java.util.*;

//class SLenComp implements Comparator<String>{
//	@Override
//	public int compare(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//}

public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
		List<Integer> listi = new ArrayList<>();
		listi.add(1);
		listi.add(100);
		listi.add(1000);
		
		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
		Collections.sort(listi, (a, b) -> b - a);
		
//		Collections.sort(list, new SLenComp());
		
		for(String s : list)
			System.out.println(s);
		
		for(Integer i : listi)
			System.out.println(i);

	}

}
