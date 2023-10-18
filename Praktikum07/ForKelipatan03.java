import java.util.Scanner;

public class ForKelipatan03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total = 0, counter = 0, bilangan;

        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = sc.nextInt();

        for (int i = 0; i < 50; i++){
            if(i % bilangan == 0){
                total += i;
                counter++;
            }
        }
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);

        sc.close();
    }
}
