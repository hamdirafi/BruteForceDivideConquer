public class MainNilai {
    public static void main(String[] args) {
        NilaiMahasiswa[] mahasiswa = {
            new NilaiMahasiswa("Ahmad", 220101001, 2022, 78, 82),
            new NilaiMahasiswa("Budi", 220101002, 2022, 85, 88),
            new NilaiMahasiswa("Cindy", 220101003, 2021, 90, 87),
            new NilaiMahasiswa("Dian", 220101004, 2021, 76, 79),
            new NilaiMahasiswa("Eko", 220101005, 2023, 92, 95),
            new NilaiMahasiswa("Fajar", 220101006, 2022, 88, 85),
            new NilaiMahasiswa("Gina", 220101007, 2023, 80, 83),
            new NilaiMahasiswa("Hadi", 220101008, 2020, 82, 84)
        };

        int[] uts = new int[mahasiswa.length];
        int[] uas = new int[mahasiswa.length];

        for (int i = 0; i < mahasiswa.length; i++) {
            uts[i] = mahasiswa[i].uts;
            uas[i] = mahasiswa[i].uas;
        }

        System.out.println("Nilai UTS Tertinggi: " + Nilai.maxUTS(uts, 0, uts.length - 1));
        System.out.println("Nilai UTS Terendah: " + Nilai.minUTS(uts, 0, uts.length - 1));
        System.out.printf("Rata-rata Nilai UAS: %.2f\n", Nilai.avgUAS(uas));
    }
}
