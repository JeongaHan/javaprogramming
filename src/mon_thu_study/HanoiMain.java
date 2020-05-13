package mon_thu_study;

class HanoisUtil{
	int tray = 3;
	int bar = 3;
	int[][] rings;
	public HanoisUtil(int tray) {
		//1
		//생성자. 배열 rings의 행은 층(숫자가 클수록 낮은 층), 열은 바를 의미한다.
		//처음 하노이 객체를 생성하면 0열(A바)에 작은숫자부터 밑으로 넣는다. 
		this.tray = tray;
		rings = new int[tray][bar];
		for(int i = 0; i < rings.length; i++) {
			int x = 2*i + 1;
			rings[i][0] = x;
		}
	}
	public int[][] getRings(){
		//2 현재의 하노이 상태를 보여준다.
		return rings;
	}
	public static void moveHanoi(int [][] a, int num, char ringA, char ringB, char ringC) {
		//3 재귀함수. 한 층씩 쪼개서 옮긴다.
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
		//매개변수 ringA는 원래 접시 위치, ringB는 옮겨질 위치
		//원래 char였던 값을 2차원 배열의 인덱스로처럼 사용해서 puts 메소드에 넘겨준다.
		//puts 메소드 호출하여 배열 바꿔준다.
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
		System.out.println(ringA + " bar쪽에 있던 링이 " + ringB + " bar쪽으로 이동");
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
		//puts메소드는 hasTray 메소드와 change 메소드를 호출하고 있는데,
		//hasTray메소드는 해당하는 바에 접시가 있는지 확인하고 접시가 있으면 그 접시가 위치한 층을 출력, 없으면 -1을 출력한다.
		//change메소드는 aa층,ab열에 있는 값을 ba층 bb열로 옮긴다.
		//접시가 옮겨지려면 원래위치의 바에 접시가 있어야 한다. ( 사실 이 조건은 없어도 실행 가능하다. )
		//원래 바, 옮겨질 바에 접시가 이미 있을 경우, 옮겨질 바의 현재 높이보다 한 층 높은 곳에 접시를 옮긴다.
		//원래 바에는 접시가 이미 있고, 옮겨질 바에는 접시가 없을 경우 가장 아래층에 접시를 옮긴다.
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
