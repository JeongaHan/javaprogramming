package datastructure;
import java.util.Scanner;

public class BubbleSort {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
//				System.out.println(i + ", " + j);
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("��������(����1)");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]= " + x[i]);
		}

	}

}