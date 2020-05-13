package mon_thu_study;

class HanoisUtil{
	int tray = 3;
	int bar = 3;
	int[][] rings;
	public HanoisUtil(int tray) {
		//1
		//������. �迭 rings�� ���� ��(���ڰ� Ŭ���� ���� ��), ���� �ٸ� �ǹ��Ѵ�.
		//ó�� �ϳ��� ��ü�� �����ϸ� 0��(A��)�� �������ں��� ������ �ִ´�. 
		this.tray = tray;
		rings = new int[tray][bar];
		for(int i = 0; i < rings.length; i++) {
			int x = 2*i + 1;
			rings[i][0] = x;
		}
	}
	public int[][] getRings(){
		//2 ������ �ϳ��� ���¸� �����ش�.
		return rings;
	}
	public static void moveHanoi(int [][] a, int num, char ringA, char ringB, char ringC) {
		//3 ����Լ�. �� ���� �ɰ��� �ű��.
		if(num==1) {
			showHanoi(a,ringA,ringB);
		}else {
			moveHanoi(a,num-1,ringA,ringC,ringB);
			showHanoi(a,ringA,ringB);
			moveHanoi(a,num-1,ringC,ringB,ringA);
		}
	}
	public static void showHanoi(int [][] a, char ringA, char ringB) {
		//4
		//�Ű����� ringA�� ���� ���� ��ġ, ringB�� �Ű��� ��ġ
		//���� char���� ���� 2���� �迭�� �ε�����ó�� ����ؼ� puts �޼ҵ忡 �Ѱ��ش�.
		//puts �޼ҵ� ȣ���Ͽ� �迭 �ٲ��ش�.
		int aa=0;
		int ab=1;
		switch(ringA) {
		case 'a': aa = 0; break;
		case 'b': aa = 1; break;
		case 'c': aa = 2; break;
		}
		switch(ringB) {
		case 'a': ab = 0; break;
		case 'b': ab = 1; break;
		case 'c': ab = 2; break;
		}
		System.out.println(ringA + " bar�ʿ� �ִ� ���� " + ringB + " bar������ �̵�");
		puts(a,aa,ab);
		showHanoi(a);
	}
	public static void showHanoi(int [][]a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("[\t");
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("]");
		}
		System.out.println("=================================");
	}
	public static int hasTray(int[][] a, int bar) {
		int no = -1;
		for(int i = 0; i<a.length;i++) {
			if(a[i][bar]!=0) {
				no=i;
				break;
			}
		}
		return no;
	}
	private static void change(int[][] a, int aa, int ab, int ba, int bb) {
		System.out.println("(" + aa + ", " + ab + ") ==> (" + ba + ", " + bb + ") :");
		a[ba][bb] = a[aa][ab];
		a[aa][ab] = 0;
	}
	public static void puts(int [][] a, int barA, int barB) {
		//5
		//puts�޼ҵ�� hasTray �޼ҵ�� change �޼ҵ带 ȣ���ϰ� �ִµ�,
		//hasTray�޼ҵ�� �ش��ϴ� �ٿ� ���ð� �ִ��� Ȯ���ϰ� ���ð� ������ �� ���ð� ��ġ�� ���� ���, ������ -1�� ����Ѵ�.
		//change�޼ҵ�� aa��,ab���� �ִ� ���� ba�� bb���� �ű��.
		//���ð� �Ű������� ������ġ�� �ٿ� ���ð� �־�� �Ѵ�. ( ��� �� ������ ��� ���� �����ϴ�. )
		//���� ��, �Ű��� �ٿ� ���ð� �̹� ���� ���, �Ű��� ���� ���� ���̺��� �� �� ���� ���� ���ø� �ű��.
		//���� �ٿ��� ���ð� �̹� �ְ�, �Ű��� �ٿ��� ���ð� ���� ��� ���� �Ʒ����� ���ø� �ű��.
		if(hasTray(a,barA)!=-1) {
			if(hasTray(a,barB)!=-1) {
				change(a,hasTray(a,barA),barA,hasTray(a,barB)-1,barB);
			}else {
				change(a,hasTray(a,barA),barA,a.length-1,barB);
			}
		}
	}
	
	
}

public class HanoiMain {

	public static void main(String[] args) {
		int tray = 4;
		HanoisUtil ha = new HanoisUtil(tray);
		int [][] a = ha.getRings();

		HanoisUtil.showHanoi(a);
		HanoisUtil.moveHanoi(a,tray,'a','b','c');

	}

}
