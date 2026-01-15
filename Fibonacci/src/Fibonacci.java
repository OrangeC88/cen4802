/**
 * The Fibonacci class calculates the nth term of the Fibonacci sequence
 * using a recursive method.
 * @author Xavier Rodriguez
 * @version 1.0
 */



public class Fibonacci {

    /**
     * The Main Method is the entry point of the program
     * it calls the fibonacci emthod and prints the result
     * @param args
     */
    public static void main(String[] args) throws Exception {
       

        int number = 10;

        int result = fibonacci(number);

        System.out.print("The nth term of the Fibonacci sequence is:: " + result);
        
    }

    /**
     * Calculates the 10th term of the fibonacci sequence using recursion
     * @param n position of the fibonacci sequence
     * @return 10th term
     */
    public static int fibonacci(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
}
