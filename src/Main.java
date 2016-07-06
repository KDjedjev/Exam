import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Array {
	public int[] f(int b[][]) {
		int c = 0;
		int a[] = new int[b.length * b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				a[c] = b[j][i] * c;
				c++;
			}
		}
		return a;
	}

	public int[][] f(int a[]) {
		int c = 0;
		int size = (int) Math.sqrt(a.length);
		int b[][] = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				b[j][i] = a[c] * c;
				c++;
			}
		}
		return b;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int b[][] = null;
		int a[] = null;
		Array arr = new Array();
		int s, n;
		System.out.println("1) One dimensional -> Two dimensional");
		System.out.println("2) Two dimensional -> One dimensional");
		s = in.nextInt();
		do {
			System.out.print("Side size(2-9): ");
			n = in.nextInt();
		} while (n < 2 || n > 9);
		System.out.println("Input array elements");

		switch (s) {
		case 1:
			a = new int[n * n];
			for (int i = 0; i < n * n; i++) {
				a[i] = in.nextInt();
			}
			b = arr.f(a);
			break;
		case 2:
			b = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					b[i][j] = in.nextInt();
				}
			a = arr.f(b);
			break;
		}
		if (b != null && a != null) {
			System.out.println("1D Array : ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
				// File fout = new File("out.txt");
				// FileOutputStream fos = new FileOutputStream(fout);
				// List<Integer> ar = new ArrayList<Integer>();
				// BufferedWriter bw = new BufferedWriter(new
				// OutputStreamWriter(fos));
				// for (int c : a) {
				// System.out.print(c);
				// ar.add(c);
				// bw.write(c);
			}
			// bw.close();
		}
		System.out.println();
		System.out.println("2D Array : ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}
}
