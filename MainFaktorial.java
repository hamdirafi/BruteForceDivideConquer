import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai faktorial: ");
        int n = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Faktorial " + n + " dengan Brute Force: " + fk.faktorialBF(n));
        System.out.println("Faktorial " + n + " dengan Divide and Conquer: " + fk.faktorialDC(n));
    }
}
