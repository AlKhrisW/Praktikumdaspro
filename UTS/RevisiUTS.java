import java.util.Scanner;

public class RevisiUTS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nama, kategoriSLTA,cekMahasiswa = "";
        char NIM;
        double skolastik, penalaranMatematika, literasiBahasa, rataRata;

        do{
            System.out.print("Nama: ");
            nama = sc.next();
            System.out.print("NIM: ");
            NIM = sc.next().charAt(0);
                if (NIM != '2'){
                    System.out.println("Bukan Mahasiswa Kelistrikan");
                    continue;
                }
            System.out.print("Kategori SLTA (SMA/SMK/MA): ");
            kategoriSLTA = sc.next();
            System.out.print("Nilai Skolastik: ");
            skolastik = sc.nextDouble();
            System.out.print("Nilai Penalaran matematika: ");
            penalaranMatematika = sc.nextDouble();
            System.out.print("Nilai Literasi Bahasa: ");
            literasiBahasa = sc.nextDouble();
            
                rataRata = (skolastik + penalaranMatematika + literasiBahasa) / 3;
            System.out.printf("Nilai Rata-rata: %.2f%n",rataRata);


            if (kategoriSLTA.equalsIgnoreCase("SMA")) {
                System.out.println("Kelas Martikulasi yang diikuti: ");
                System.out.println("Praktikum Rangkaian Listrik");
                if (penalaranMatematika < 75) {
                    System.out.println("Kalkulus 1");
                    if ( literasiBahasa < 65) {
                        System.out.println("Bahasa Inggris");
                    }
                } else if (literasiBahasa < 65){
                    System.out.println("Bahasa Inggris");
                }
            } else if (kategoriSLTA.equalsIgnoreCase("MA")) {
                System.out.println("Kelas Martikulasi yang diikuti: ");
                System.out.println("Praktikum Listrik");
                System.out.println("Kalkulus 1");
                if (literasiBahasa < 65) {
                    System.out.println("Bahasa Inggris");
                }
            } else if (kategoriSLTA.equalsIgnoreCase("SMK")) {
                System.out.println("Kelas Martikulasi yang diikuti: ");
                System.out.println("Kalkulus 1");
                if (rataRata < 70) {
                    System.out.println("Praktikum Rangkaian Listrik");
                    if (literasiBahasa < 65) {
                        System.out.println("Bahasa Inggris");
                    } 
                } else if (literasiBahasa < 65){
                    System.out.println("Bahasa Inggris");
                }
                
            }

        System.out.println("Cek mahasiswa lain? (y/n): ");
        cekMahasiswa = sc.next();

        }while (cekMahasiswa.equalsIgnoreCase("y"));

        sc.close();
    }
}