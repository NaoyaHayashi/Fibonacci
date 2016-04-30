
public class FibonacchiSimulator {
	/// global counter////
	static int counter = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = fib(5);
		
		System.out.println("The # of execution: " + counter);
		System.out.println("The fibonacchi # is " + n);
	}
	
	/// fibonacchi method ///
	public static int fib (int n){
		if(n==0 || n==1){
			counter++;
			return 1;
		}
		else{
			return (fib(n-1)+fib(n-2));
		}
	}

}
