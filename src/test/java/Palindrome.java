
public class Palindrome {
	public static void main(String[] args) {
		int x=1234321;
		int temp=x;
		int rev=0;
		while(x!=0)
		{
			int c=x%10;
			rev=rev*10+c;
			x=x/10;
			
			
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
		{
			System.out.println(temp+" not a palindrome");
		}
	}

}
