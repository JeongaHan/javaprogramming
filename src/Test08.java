//�߻�Ŭ����

abstract class Animal4{
	public abstract void breath();//�߻�޼ҵ�
	public void eat() {
		System.out.println("Animal4 eat");
	}
}
class Dog4 extends Animal4{
	public void breath() {//�߻�޼ҵ� ����
		System.out.println("Dog4 breath");
	}
}


public class Test08 {

	public static void main(String[] args) {
		Animal4 a = new Dog4();
		a.breath();

	}

}
