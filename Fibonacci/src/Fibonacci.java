
public class Fibonacci {
    public static void main(String[] args) throws Exception {
       

        int number = 10;

        int result = fibonacci(number);

        System.out.print("The nth term of the Fibonacci sequence is:: " + result);
        
    }


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
