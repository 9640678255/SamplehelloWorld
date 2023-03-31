import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			int rem = a % i;
			if (rem == 0) {
				sum = sum + rem;

			}
		}
		if(sum>a)
		{
			System.out.println("abundant number");
		}
		else
		{
			System.out.println("not a abundant number");
		}

	}

}
