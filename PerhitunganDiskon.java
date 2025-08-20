
import java.util.Scanner;



public class PerhitunganDiskon {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double totalbeli, diskon, hargakahir, bayar, kembalian;

        System.out.println("\nBerapatotal belanja anda: ");
        totalbeli = input.nextDouble();
         System.out.println("\nOkee total belanja saya adalah: " + totalbeli);



       

        if (totalbeli > 500000) {
            System.out.println("\nBaik, Anda mendapat diskon sebesar 20%");
            diskon = 0.2 * totalbeli;
        } else if (totalbeli > 250000) {
            System.out.println("\nBaik, Anda mendapat diskon sebesar 15%");
            diskon = 0.15 * totalbeli;
        } else if (totalbeli > 100000) {
            System.out.println("\nBaik, Anda mendapat diskon sebesar 10%");
            diskon = 0.1 * totalbeli;
        } else {
            System.out.println("\nMohon maaf anda tidak mendapat diskon");
            diskon = 0;
        }
 hargakahir = totalbeli - diskon;


        System.out.println("\nSilahkan lakukan pembayaran");
        bayar = input.nextDouble();

        kembalian = bayar - hargakahir;

        if (bayar > hargakahir) { 
            System.out.println("\nTerima kasih, kembalian anda: " + kembalian);
        } else if (bayar == hargakahir) {
            System.out.println("\nTerima kasih, uang anda pas.");
        } else {
            System.out.println("\nMaaf, uang anda kurang.");
        }

        System.out.println("\nTerima kasih telah berbelanja di toko kami");
}
}

