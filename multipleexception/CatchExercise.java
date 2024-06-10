package exception.multipleexception;

public class CatchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
	            
	            int[] a = new int[5];// Declare an array
	            
	            // Initialize the array with a value
	            a[5] = 30 / 5;
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        }
	    }
		

	}

