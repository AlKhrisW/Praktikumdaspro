import java.util.Scanner;

public class LoginProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String inputUname, inputPass;
        
        String[] usernameArray = {"admin", "guru"};
        String[] passwordArray = {"admin123", "guru123"};

        System.out.println("------ Login Sistem Penggajian Guru ------");
        System.out.print("Username: ");
        inputUname = sc.nextLine();
        System.out.print("Password: ");
        inputPass = sc.nextLine();

        boolean isUsernameValid = false, isPasswordValid = false;
        
        for (int i = 0; i < usernameArray.length; i++) {
            if (usernameArray[i].equals(inputUname)) {
                isUsernameValid = true;
                if (passwordArray[i].equals(inputPass)) {
                    isPasswordValid = true;
                    break;
                }
            }
        }

        if (isUsernameValid && isPasswordValid) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau Password Anda salah!");
        }
        sc.close();
    }
}
