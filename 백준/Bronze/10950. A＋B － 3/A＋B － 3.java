import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int num1, num2 = 0;
		int[] arr = new int[cnt];
		
		for(int i=1; i<=cnt; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			arr[i-1] = num1+num2;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
