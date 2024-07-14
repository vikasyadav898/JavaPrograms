package exception;

public class ArithMaticException {

	public static void main(String[] args) {
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is zero
    }

}
