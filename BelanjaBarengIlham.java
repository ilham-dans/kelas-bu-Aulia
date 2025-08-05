package KelasBuAulia;
import java.util.Scanner;
public class BelanjaBarengIlham {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan Harga Barang: ");
        double hargaBarang = input.nextDouble();
       // input.nextLine(); // Clear the newline character from the buffer

        System.out.println("Masukkan Nama Barang: ");
        String namaBarang1 = input.next();
        System.out.println("Masukkan Harga Barang: ");
        double hargaBarang1 = input.nextDouble();

        double totalHarga = hargaBarang + hargaBarang1;

        System.out.println("=====================");
        System.out.println("Barang yang dibeli:"+ namaBarang + " dan " + namaBarang1);
        System.out.println("harga:" + hargaBarang + " + " + hargaBarang1);
        System.out.println("Total Harga: " + totalHarga);
}
}