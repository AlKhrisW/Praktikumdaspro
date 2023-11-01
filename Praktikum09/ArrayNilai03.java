import java.util.Scanner;
public class ArrayNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        double jumlah = 0, rataRata;
        int max = 0, min = 100, jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            jumlah += nilaiAkhir[i];

            if (nilaiAkhir[i] > max) {
                max = nilaiAkhir[i];
            } else if (nilaiAkhir[i] < min) {
                min = nilaiAkhir[i];
            }
        }
        for (int i = 0; i < 10; i++){
            if(nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus");
                jumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus");
                jumlahTidakLulus++;
            }
        }
        rataRata = jumlah / nilaiAkhir.length;
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        sc.close();
    }
}
