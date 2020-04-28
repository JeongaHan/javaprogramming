interface Printable2{
	void print(String doc);
}
interface ColorPrintable extends Printable2{
	void printCMYK(String doc);
}
class Prn909Crv implements ColorPrintable{
	@Override
	public void print(String doc) {
		System.out.println("Form MD-909 black & white ver");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

class Prn111Crv implements ColorPrintable{
	@Override
	public void print(String doc) {
		System.out.println("Form MD-111 black & white ver");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-111 CMYK ver");
		System.out.println(doc);
	}
}


public class Test03 {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable2 prn = new Prn909Crv();
		prn.print(myDoc);
		//prn.printCMYK(myDoc);
		
		ColorPrintable prn2 = (ColorPrintable)prn;
		prn2.print(myDoc);
		prn2.printCMYK(myDoc);
		
		ColorPrintable prn3 = new Prn111Crv();
		prn3.print(myDoc);
		prn3.printCMYK(myDoc);

	}

}
