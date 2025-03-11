import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan: ");
        int jumlah = sc.nextInt();
        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        Sum sum = new Sum(data);
        System.out.println("Total keuntungan dengan Brute Force: " + sum.totalBF());
        System.out.println("Total keuntungan dengan Divide and Conquer: " + sum.totalDC(0, data.length - 1));
    }
}
