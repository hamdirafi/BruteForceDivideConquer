import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = input.nextInt();
        Pangkat[] p = new Pangkat[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();
            p[i] = new Pangkat(basis, pangkat);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Hasil " + p[i].angka + "^" + p[i].pangkat + " (Brute Force): " + p[i].pangkatBF());
            System.out.println("Hasil " + p[i].angka + "^" + p[i].pangkat + " (Divide & Conquer): " + p[i].pangkatDC(p[i].angka, p[i].pangkat));
        }
    }
}
