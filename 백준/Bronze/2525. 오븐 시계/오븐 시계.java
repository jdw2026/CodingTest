import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		if(m+c<60) {
			System.out.println(h+" "+(m+c));
		}else {
			int hh = (m+c)/60;
			int mm = (m+c)%60;

			if(h+hh>=24) {
				System.out.println(((h+hh)%24)+" "+(mm));
			}else {
				System.out.println((h+hh)+" "+(mm));
			}
		}
	}
}
