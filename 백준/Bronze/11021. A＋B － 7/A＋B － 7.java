import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for(int i=1; i<=cnt; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i-1] = num1+num2;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("Case #"+(i+1)+": "+arr[i]);
		}	
	}
}
