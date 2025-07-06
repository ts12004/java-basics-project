// 7. Prime Number Checker 
public class PrimeChecker { 
    public static void main(String[] args) { 
        int num = 29; 
        boolean isPrime = true; 
        for(int i = 2; i <= Math.sqrt(num); i++) { 
            if(num % i == 0) { 
                isPrime = false; 
                break; 
            } 
        } 
        System.out.println(num + (isPrime ? " is prime" : " is not prime")); 
    } 
}
