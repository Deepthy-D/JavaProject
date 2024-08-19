

public class ReverseDigit {
	public static void main(String[] args) {
		int num = 745323, reversed = 0;
		System.out.println("Reversed Numbers:");
		
		while (num!=0){
			int number = num%10;
		reversed = reversed * 10 + number;
		num/=10;
		
		
		// print each digit one by one
	System.out.println(number);
	}
	}
}