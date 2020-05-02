package datastructure;

public class Main2 {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
//		numbers.add(1, 15);
//		System.out.println(numbers.node(2));
//		System.out.println(numbers.removeFirst());
//		System.out.println(numbers.remove(1));
//		System.out.println(numbers.removeLast());
//		System.out.println(numbers);
//		System.out.println(numbers.size());
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.indexOf(50));
		LinkedList.ListIterator i = numbers.listIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		i.add(5);
		i.next();
		i.add(15);
		i.remove();
		System.out.println(numbers);
		


	}

}
