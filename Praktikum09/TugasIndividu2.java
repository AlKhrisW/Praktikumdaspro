import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        
        for (int i = 0; i < a.length; i++){
            System.out.print("Masukkan angka ke-" + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("------------------------------");
        for (int i = a.length - 1; i >= 0; i--){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
