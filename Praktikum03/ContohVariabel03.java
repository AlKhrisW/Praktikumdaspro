public class ContohVariabel03 {
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Badminton";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double $ipk = 3.8, tinggi = 1.70;

        System.out.println("Hobi: " + salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + $ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umur, tinggi));
    }
}