public class CobaArgs03 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hai " + args[0]);
            System.out.println("Selamat Datang di " + args[1]);   
        } else {
            System.out.println("Hai, Selamat Datang");
        }
    }
}
