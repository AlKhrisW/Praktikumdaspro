import java.util.Scanner;

public class LampuLaluLintas03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String warna;

        System.out.print("Masukkan warna lampu: ");
        warna = sc.nextLine();

        switch (warna){
            case "merah":
            System.out.println("silahkan berhenti");
            break;
            case "kuning":
            System.out.println("mohon bersiap");
            break;
            case "hijau":
            System.out.println("silahkan jalan kembali");
            break;
        }

        sc.close();
    }
}
