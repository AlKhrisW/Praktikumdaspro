import java.util.Scanner;

public class WhileGaji03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur, i = 0;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        sc.nextLine();

        while(i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.nextLine();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();

                sc.nextLine();

            i++;

            if(jabatan.equalsIgnoreCase("DIREKTUR")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("JABATAN INVALID");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;

            //i++;
        }
        System.out.println("Total gaji Lembur: " + totalGajiLembur);

            sc.close();
    }
}
