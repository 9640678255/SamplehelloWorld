
public class HarshadNumber {
	public static void main(String[] args) {
		int a=122;
		int sum = 0;
		int temp=a;
		while (a != 0) {
			int rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}
		System.out.println(sum);
		if (temp % sum == 0) {
			System.out.println(" is a hashad number");

		} else {
			System.out.println("not a harshad number");
		}
	}

}
