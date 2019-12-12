import java.util.Scanner;
public class LabExer1B{
	public static void main (String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int req = S.nextInt();
		showNumberPlus10(req);
		showNumberPlus100(req);
		showNumberPlus1000(req);
	}
	public static void showNumberPlus10(int a){
		int b = a + 10;
		System.out.println(a + " plus 10 is " + b);
		}
			public static void showNumberPlus100(int ab){
		int b = ab + 100;
		System.out.println(ab + " plus 100 is " + b);
		}
			public static void showNumberPlus1000(int abc){
		int b = abc + 1000;
		System.out.println(abc + " plus 1000 is " + b);
		}
}