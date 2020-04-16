
interface Printable4{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}

class Printer4 implements Printable4{}
public class Test07 {

	public static void main(String[] args) {
		String myDoc = "This is a report about ...";
		Printable4 prn = new Printer4();
		prn.print(myDoc);

		Printable4.printLine("end of line");

	}

}
