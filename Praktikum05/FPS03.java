import java.util.Scanner;

public class FPS03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double weaponRange;

        System.out.print("masukkan jarak serangan anda: ");
        weaponRange = sc.nextDouble();

        if(weaponRange <= 5){
            System.out.println("Melee weapon");
        }
        else{
            System.out.println("Ranged weapon");
        }

        sc.close();
    }
}