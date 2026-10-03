//package practical4;
//
//public class ArithmaticException extends Exception {
//public static void main(String[]args) {
//	try {
//		int result = arr[0]/arr[4];
//	}catch(ArithmeticException e) {
//		System.out.println("Denominator should not be 0");
//	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("Exception Completed");
//		
//	}
//}
//}
class bank{
	void transfer(int amt, int balance)throws Exception {
		if(amount>balance) {
			throw new Exception("transaction failed:Due to insufficient");
			
		}
		System.out.println("Tansaction is successful");
		
	}
}
public class Main {
	public static void main(String[] args) {
	b.transfer(amount 1000,balance 5000);
	}catch(Exception e) {
		System.out.println("Error "+e.getMessage());
	}
	}
	
	
}