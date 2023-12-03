import java.util.Scanner;

public class TugasIndividu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMinggu = sc.nextInt();
        int[][] nilai = new int[jumlahMinggu][jumlahMahasiswa];

        inputNilai(nilai);
        displayNilai(nilai);
        displayMax(nilai);

        sc.close();
    }

    public static void inputNilai(int[][] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai minggu ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void displayNilai(int[][] nilai) {
        System.out.println("===================================");
        for (int i = 0; i < 1; i++) {
            System.out.printf("| %-11s |", " ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf(" %-7s |", "Siswa " + (j+1));
            }
            System.out.println();
        }
        System.out.println("===================================");

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("| %-11s |", "Minggu Ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf(" %-7s |", nilai[i][j]);
            }
            System.out.println();
            System.out.println("===================================");
        }
    }

    public static void displayMax(int[][] nilai) {
        
        for (int i = 0; i < nilai.length; i++) {
            int max = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                }
            }
            System.out.println("Nilai tertingggi minggu ke-" + (i + 1) + ": " + max);
        }
    }
}
