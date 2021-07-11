package JavaWeek2Lab;

public class DisplayPrimeNumbers {
	public static void main(String[] args) {
		int i, num = 0;
		String prime_no = "";
		for (i=1; i <= 100; i++) 
		{
			int ctr = 0;
			for (num=i; num>=1; num--) 
			{
				if (i%num == 0) 
				{
					ctr += 1;
				}
			}
			 if (ctr == 2) 
			 {
				 prime_no = prime_no + i + " ";
			 }
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(prime_no);
	}
}
