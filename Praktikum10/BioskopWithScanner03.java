import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();

            if (menu == 1) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
    
                    if (penonton[baris-1][kolom-1] == null){
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("Kursi Tidak Tersedia");
                        continue;
                    }

                    System.out.println("Input penonton lain? (y/n)");
                    next = sc.next();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                }
                System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
                System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
                System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
                System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
            }
        } while (menu != 3);
        
        sc.close();
    }
}
