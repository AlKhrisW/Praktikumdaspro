import java.util.Scanner;

public class Bilangan03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int bilangan1, bilangan2, bilangan3, bilanganTerbesar;

       System.out.print("Masukkan bilangan 1: ");
       bilangan1 = sc.nextInt();
       System.out.print("Masukkan bilangan 2: ");
       bilangan2 = sc.nextInt();
       System.out.print("Masukkan bilangan 3: ");
       bilangan3 = sc.nextInt();

       bilanganTerbesar = bilangan1 > bilangan2 ? (bilangan1 > bilangan3 ? bilangan1 : (bilangan1 > bilangan3 ? bilangan1 : bilangan3)) : (bilangan1 > bilangan3 ? bilangan2 : (bilangan2 > bilangan3 ? bilangan2 : bilangan3));

       System.out.print("bilangan terbesar: " + bilanganTerbesar);
       bilanganTerbesar = sc.nextInt();

      sc.close();
   }
}
