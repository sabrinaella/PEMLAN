public class manager extends pekerja{
    private String departemen;

    public manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    } 
 
    public double getTunjangan() {
        return super.getTunjangan() + (super.getGaji() * 0.1);
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen: " + departemen;
    }
}