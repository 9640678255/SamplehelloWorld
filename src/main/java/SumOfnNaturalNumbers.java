import java.util.Scanner;

public class SumOfnNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			count+=i;
		}
		System.out.println(count);
	}

}
