import java.util.Scanner;

public class Individu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Perulangan: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
