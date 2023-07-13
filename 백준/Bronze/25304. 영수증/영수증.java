import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int totalCnt = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=totalCnt; i++) {
			int money = sc.nextInt();
			int cnt = sc.nextInt();
			sum += money*cnt;
		}
		if(total==sum)System.out.println("Yes");
		else System.out.println("No");
	}

}
