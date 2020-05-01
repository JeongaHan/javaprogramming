package datastructure;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		ArrayList.ListIterator it = numbers.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		while(it.hasNext()) {
			int number = (int)it.next();
			if(number == 30) {
				it.add(35);
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
