import java.util.Scanner;

public class WhileKelipatan03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 0, total = 0, counter = 0, bilangan;

        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = sc.nextInt();

        while (i < 50){
            if(i % bilangan == 0){
                total += i;
                counter++;
            }
            i++;
        }
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);

        sc.close();
    }
}
