//interface는 object화 할 수 없다.

interface Animal{//코드 구현하지 않고 선언만 하겠다.느슨한 형태의 구조
	void breath();
}

class Dog implements Animal{
	//@Override
	public void breath() {
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}
class Cat implements Animal{
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("Cat meow");
	}
}

public class Test01 {
	
	static void test(Animal a) {
		a.breath();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d; // 상위 타입으로 하위클래스 객체를 받는다.
		a.breath();
		Animal c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}

}
