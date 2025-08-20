import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Masukan nama lampu");

String lampu = input.nextLine();

switch (lampu) {
    case "Merah": System.out.println("Anda harus berhenti!");
        break;
case "Kuning": System.out.println("Anda harus bersiap-siap!");
        break;
        case "Hijau": System.out.println("Anda boleh jalan!");
    default: System.out.println("Lampu tidak dikenal, silakan periksa kembali!");
        break;
}


    }
}