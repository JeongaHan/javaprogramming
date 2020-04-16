//interface�� objectȭ �� �� ����.

interface Animal{//�ڵ� �������� �ʰ� ���� �ϰڴ�.������ ������ ����
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
		Animal a = d; // ���� Ÿ������ ����Ŭ���� ��ü�� �޴´�.
		a.breath();
		Animal c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}

}
