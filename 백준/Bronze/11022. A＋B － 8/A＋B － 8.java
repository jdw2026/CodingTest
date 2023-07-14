import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		int[] num1 = new int[cnt];
		int[] num2 = new int[cnt];
		
		for(int i=1; i<=cnt; i++) {
			num1[i-1] = sc.nextInt();
			num2[i-1] = sc.nextInt();
			arr[i-1] = num1[i-1]+num2[i-1];	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("Case #"+(i+1)+": "+num1[i]+" + "+num2[i]+" = "+arr[i]);
		}
	
	}

}
