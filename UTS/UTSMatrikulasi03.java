import java.util.Scanner;

public class UTSMatrikulasi03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nama, NIM, kategoriSLTA, kelasMatrikulasi, cekMahasiswa;
        double skolastik, penalaranMatematika, literasiBahasa, rataRata;

        do{
        System.out.print("Nama: ");
        nama = sc.next();
        System.out.print("NIM: ");
        NIM = sc.next();
        System.out.print("Kategori SLTA (SMA/SMK/MA): ");
        kategoriSLTA = sc.next();
        System.out.print("Nilai Skolastik: ");
        skolastik = sc.nextDouble();
        System.out.print("Nilai Penalaran matematika: ");
        penalaranMatematika = sc.nextDouble();
        System.out.print("Nilai Literasi Bahasa: ");
        literasiBahasa = sc.nextDouble();
        
            rataRata = (skolastik + penalaranMatematika + literasiBahasa) / 3;

        System.out.print("Nilai Rata-rata: " + rataRata + "\n");

        if (kategoriSLTA.equalsIgnoreCase("SMA")) {
            kelasMatrikulasi = "Praktikum Rangkaian Listrik";
            if (penalaranMatematika < 75) {
                kelasMatrikulasi = "Praktikum Rangkaian Listrik\n Matrikulasi Kalkulus 1";
                if (literasiBahasa < 65) {
                kelasMatrikulasi = "Praktikum Rangkaian Listrik\n Matrikulasi Kalkulus 1\n Bahasa Inggris Dasar";
                }
            } else {
                kelasMatrikulasi = "Praktikum Rangkaian Listrik\n Bahasa Inggris Dasar";
            }
            
        System.out.println("Kelas Matrikulasi yang diikuti: \n" + kelasMatrikulasi);

        } else if (kategoriSLTA.equalsIgnoreCase("MA")) {
            kelasMatrikulasi = "Praktikum Rangkaian Listrik \n" + "Matrikulasi Kalkulus 1";
            if (literasiBahasa < 65) {
                kelasMatrikulasi = "Praktikum Rangkaian Listrik \n Matrikulasi Kalkulus 1\n Bahasa Inggris Dasar";
            }
        System.out.println("Kelas Matrikulasi yang diikuti: \n" + kelasMatrikulasi);
        } else if (kategoriSLTA.equalsIgnoreCase("SMK")) {
            kelasMatrikulasi = "Matrikulasi Kalkulus 1";
            if (rataRata < 70) {
                kelasMatrikulasi = "Matrikulasi Kalkulus 1\n Praktikum Rangkaian Listrik";
                if (literasiBahasa < 65) {
                kelasMatrikulasi = "Matrikulasi Kalkulus 1\n Praktikum Rangkaian Listrik\n Bahasa Inggris Dasar";
                } 
            } else {
                kelasMatrikulasi = "Matrikulasi Kalkulus 1\n Bahasa Inggris Dasar";
            }
            
        System.out.println("Kelas Matrikulasi yang diikuti: \n" + kelasMatrikulasi);
        }

        System.out.print("Cek mahasiswa lain? (y/n): ");
        cekMahasiswa = sc.next();

        // if (cekMahasiswa.equalsIgnoreCase("y")){
        //     continue;
        // }
    
    }while (cekMahasiswa.equalsIgnoreCase("y"));
    }
}