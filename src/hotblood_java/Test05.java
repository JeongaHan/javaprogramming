package hotblood_java;
import java.util.function.*;

class Box<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob;}
}


public class Test05 {

	public static void main(String[] args) {
		BiConsumer<Box<Integer>, Integer> c1 = (b, i) -> b.set(i);
		BiConsumer<Box<Double>, Double> d1 = (b, i) -> b.set(i);
		
		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();
		
		c1.accept(box1, 3);
		d1.accept(box2, 2.2);
		
		System.out.println(box1.get());
		System.out.println(box2.get());

	}

}
