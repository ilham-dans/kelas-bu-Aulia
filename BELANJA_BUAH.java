import java.util.Scanner;

public class BELANJA_BUAH{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

 System.out.print("\nMasukkan nama pembeli: ");
        String nama = input.nextLine();

        double hargaAnggur = 15000, hargaKiwi = 10000;
        System.out.println("\nHarga satuan Anggur: " + hargaAnggur);
        System.out.println("\nHarga satuan Kiwi: " + hargaKiwi);


        System.out.print("\nMasukkan jumlah Anggur yang dibeli: ");
        int anggur = input.nextInt();
        System.out.print("\nMasukkan jumlah Kiwi yang dibeli: " + "\n");
        int kiwi = input.nextInt();
        double total, bayar, kembalian;

         total = (anggur * hargaAnggur) + (kiwi * hargaKiwi);

         System.out.println(" \nharga total belanja: " + total);
 System.out.print("Masukkan uang yang dibayarkan: ");
        bayar = input.nextDouble();
        kembalian = bayar - total;

        

        System.out.println("\n===================================");
        System.out.println("           STRUK BELANJA           ");
        System.out.println("===================================");
        System.out.println("Nama Pembeli         : " + nama);
        System.out.println("Anggur dibeli        : " + anggur + " x Rp " + hargaAnggur);
        System.out.println("Kiwi dibeli          : " + kiwi + " x Rp " + hargaKiwi);
        System.out.println("====================================");
        System.out.println("Total pembayaran     : Rp " + total);
        System.out.println("Uang dibayarkan      : Rp " + bayar);
        System.out.println("Kembalian            : Rp " + kembalian);
        System.out.println("===================================");
        System.out.println("Terima kasih telah berbelanja di toko kami, " + nama );

    }
}
