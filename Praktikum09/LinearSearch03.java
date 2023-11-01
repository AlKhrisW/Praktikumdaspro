import java.util.Scanner;

public class LinearSearch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayInt;
        int key, hasil = 0, n;

        System.out.print("Masukkan jumlah eleman array: ");
        n = sc.nextInt();
        arrayInt = new int[n];
        
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }            
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (key == arrayInt[i]) {
                hasil = i;
                System.out.println("key ada dalam array pada posisi index ke-" + hasil);
                break;
            } else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
        sc.close();
    }
}
