

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		for(int i =0; i<e.length()-10; i++)
  {
  double digits = Double.parseDouble(e.substring(i, i+10));
  if (isPrime(digits)){
    System.out.println(digits);
 break;
  }
  }
	
	}
	

	//Finish this function
	public boolean isPrime(double num){
	if(num < 2)
    return false;
  for(int i = 2; i <= Math.sqrt(num); i++)
    if(num % i == 0)
      return false;
    return true;  
	}

}

