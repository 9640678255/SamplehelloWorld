
public class SumOfGivenNum {
	public static void main(String[] args) {
		int x=1234;
		int sum=0;
		while(x!=0)
		{
			int y=x%10;
			sum=sum+y;
			x=x/10;
		}
		System.out.println(sum);
	}

}
