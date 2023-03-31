import java.util.Scanner;

public class GivenRangeAmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp2=a;

		int count = 0;
		while (a != 0) {
			int rem = a % 10;
			count++;
			a = a / 10;
		}
		System.out.println(count);
		int temp1 = temp2;
		int sum=0;
		while (temp1 != 0) {
			int rem1 = temp1 % 10;
			int pow = 1 ;
						for (int i = 1; i <= count; i++) {
				pow = pow * rem1;
			}
			 sum=sum+pow;
			temp1 = temp1 / 10;
			
		}
		System.out.println(sum);
		if (sum==temp2)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}

}