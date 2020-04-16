//추상클래스

abstract class Animal4{
	public abstract void breath();//추상메소드
	public void eat() {
		System.out.println("Animal4 eat");
	}
}
class Dog4 extends Animal4{
	public void breath() {//추상메소드 구현
		System.out.println("Dog4 breath");
	}
}


public class Test08 {

	public static void main(String[] args) {
		Animal4 a = new Dog4();
		a.breath();

	}

}
