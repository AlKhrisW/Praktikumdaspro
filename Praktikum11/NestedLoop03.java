import java.util.Scanner;

public class NestedLoop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata;
        
        System.out.print("Masukkan Jumlah Kota yang Ingin di Input: ");
        int n = sc.nextInt();
        double[][] suhu = new double[n][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i+1));
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke-" + (j+1) + ": ");
                suhu[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i+1) + ": ");
            double jumlah = 0;
            for (double temp : suhu[i]) {
                System.out.print(temp + " ");
                jumlah += temp;
            }
            rata = jumlah / 4;
            System.out.println();
            System.out.println("Rata-rata suhu: " + rata);
        }
        sc.close();
    }
}
