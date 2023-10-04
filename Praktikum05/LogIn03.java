import java.util.Scanner;

public class LogIn03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password;

        System.out.print("masukkan username anda: ");
        username = sc.nextLine();
        System.out.print("masukkan password anda: ");
        password = sc.nextLine();

        if (username.equals("khrisna") && password.equals("aldo1234")) {
            System.out.println("selamat datang kembali");
        } else {
            System.out.println("username atau password salah");
        } 
        sc.close();
    }   
}
