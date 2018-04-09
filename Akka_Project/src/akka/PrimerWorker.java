package akka;

public class PrimerWorker {
	
	

	public static void main(String[] args) {
		//testing variables
		int start=3;
		int end=100;
		
		//loop all over the range
		for (int i=start;i<=end;i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
		

	}
	
	private static boolean isPrime (int n) {
		if (n==1) return false;
		
		else if (n==2) return true;
		
		if (n%2==0) return false;
		
		//prime factor can never be more than the square root
		
	   for (int i=3;i*i<n;i+=2) {
		   if (n%i==0) return false;
	   }
	   
	   return true;
	}

}
