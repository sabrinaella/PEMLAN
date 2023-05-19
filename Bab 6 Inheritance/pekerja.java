import java.time.LocalDate;

public class pekerja extends Manusia {
    private double gaji; 
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        LocalDate tanggalMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.gaji = gaji;
        this.tahunMasuk = tanggalMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = LocalDate.of(tahunMasuk, 1, 1);
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return gaji * 0.05;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return gaji * 0.1;
        } else if (lamaBekerja > 10) {
            return gaji * 0.15;
        } else {
            return 0.0;
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20.0);
    }

    @Override
    public String toString() {
        return super.toString() + "\ntahun masuk: " + tahunMasuk.getYear() + "\njumlah anak: " + jumlahAnak + "\ngaji: " + gaji;
    }
}