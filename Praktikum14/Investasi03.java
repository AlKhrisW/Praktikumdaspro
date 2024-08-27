package Praktikum14;

import java.util.Scanner;

public class Investasi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan uang investasi: ");
        double uangInvestasi = sc.nextDouble();
        System.out.print("Masukkan jumlah tahun: ");
        int tahun = sc.nextInt();

        double bunga = 11.7;
        double uangAkhir = uangInvestasi * Investasi(bunga, tahun);

        System.out.println("Hasil investasi: " + (int) uangAkhir);
        System.out.println("Hasil Investasi: " + (int) InvestasiIteratif(uangInvestasi, tahun, bunga));
    }
    public static double Investasi(double bunga, int tahun) {
        if (tahun == 0) {
            return 1;
        } else {
            return (1 + bunga / 100) * Investasi(bunga, tahun - 1);
        }
    }
    public static double InvestasiIteratif(double uangInvestasi, int tahun, double bunga) {
        for (int i = 0; i < tahun; i++) {
            uangInvestasi = uangInvestasi * (1 + 11.7 / 100);
        }
        return uangInvestasi;
    }
}
