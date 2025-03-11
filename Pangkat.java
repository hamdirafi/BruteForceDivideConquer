public class Pangkat {
    public int angka, pangkat;

    public Pangkat(int angka, int pangkat) {
        this.angka = angka;
        this.pangkat = pangkat;
    }

    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }
        return hasil;
    }

    public int pangkatDC(int angka, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else if (pangkat % 2 == 1) { 
            return angka * pangkatDC(angka, pangkat - 1);
        } else {
            int hasil = pangkatDC(angka, pangkat / 2);
            return hasil * hasil;
        }
    }
}
