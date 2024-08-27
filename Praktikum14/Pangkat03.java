package Praktikum14;

public class Pangkat03 {
    public static void main(String[] args) {
        System.out.println(pangkat(6, 4));
        pangkatIterative(6, 4);
    }
    public static int pangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x *pangkat(x, y -1);
        }
    }
    public static int pangkatIterative(int x, int y) {
        int hasil = 1;

        for (int i = 1; i <= y; i++) {
            hasil = hasil * x;
            System.out.print(x + " x ");
        }
        System.out.print(1);
        System.out.print(" = " + hasil);

        return hasil;
    }
}
