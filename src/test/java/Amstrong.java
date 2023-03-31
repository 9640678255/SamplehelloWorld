
public class Amstrong {
	public static void main(String[] args) {
		int num=377;
		int r=num;
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
		int temp=r;
		int sum=0;
		while(temp!=0)
		{
			int x=temp%10;
			int p=1;
			for(int i=1;i<=count;i++)
			{
				p=p*x;
			}
			sum=sum+p;
			temp=temp/10;
			
			
		}
		if(r==sum)
		{
			System.out.println(" palindrome");
		}
		else
		{
			System.out.println(" not a palindrome");
		}
	}

}
