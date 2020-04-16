//373

interface Printable3 {
	void print(String doc);
	default void printCMYK(String doc) {}
}
class Prn731Drv2 implements Printable3{
	@Override
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}
class Prn909Drv2 implements Printable3{
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 printer");
		System.out.println(doc);}
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

public class Test06 {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable3 prn1 = new Prn731Drv2();
		prn1.print(myDoc);
		System.out.println();
		
		Printable3 prn2 = new Prn909Drv2();
		prn2.print(myDoc);
		prn2.printCMYK(myDoc);

	}

}
