
interface IAnimal{
	public void breath();
}
abstract class Dog5 implements IAnimal{
	@Override
	public abstract void breath();
}

class Dog6 extends Dog5{
	@Override
	public void breath() {
		System.out.println("Dog6 breath");
	}
}

public class Test09 {

	public static void main(String[] args) {
		IAnimal a = new Dog6();
		a.breath();

	}

}
