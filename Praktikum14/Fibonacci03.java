package Praktikum14;

public class Fibonacci03 {
    public static void main(String[] args) {
        int n = 12, hasil;

        for (int i = 1; i <= n; i++) {
            hasil = fibonacci(i);
            System.out.print(hasil + ", ");
        }
        System.out.println("...");

        for (int index = 1; index <= n; index++) {
            hasil = fibonacciIterative(index);
            System.out.print(hasil + ", ");
        }
        System.out.println("...");
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int min1 = 0, min2 = 1, minn = 0;
        for (int i = 2; i <= n; i++) {
            minn = min2 + min1;
            min1 = min2;
            min2 = minn;
        }

        return minn;
    }
}
