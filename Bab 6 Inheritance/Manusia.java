public class Manusia{
    private String nama, nik;
    private boolean jenisKelamin, menikah; //true = laki-laki, false = perempuan

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik = nik;
    }

    public String getJenisKelamin(){
        return nik;
    }
    public void setJenisKelamin(){
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah(){
        return menikah;
    }
    public void setMenikah(){
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if(menikah){
            if(jenisKelamin){
                return 25; // true = laki-laki
            } else{
                return 20; // false = perempuan
            }
        } else{
            return 15; // belum menikah
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString(){
        return "Nama : " + nama + "\nNik : " + "\nJenis Kelamin : " + (jenisKelamin? "Laki-laki" : "Perempuan") + "\nPendapatan : " + getPendapatan();
    }
}