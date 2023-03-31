import java.util.Scanner;
public class Automorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sq=a*a;
		System.out.println(sq);
		int temp=sq;
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem==a) {
				System.out.println(a+" is automorphic number");
				break;
				
			}
			
			
		}
	}

}
