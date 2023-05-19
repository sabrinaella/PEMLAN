public class mahasiswaFilkom extends Manusia{
    private String nim;
    private double ipk; 

    public mahasiswaFilkom(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }

    public double getIpk(){
        return ipk;
    }
    public void setIpk(Double ipk){
        this.ipk = ipk;
    }

    public double getBeasiswa(){
        if (ipk >= 3.0 && ipk <= 3.5){
            return 50;
        } else if (ipk > 3.5 && ipk <= 4.0){
            return 75;
        } else{
            return 0;
        }
    }

    public String getStatus(){
        String  prodi = "";
        String angkatan = "20" + nim.substring(0,2);
        int nimCode = Integer.valueOf(String.valueOf(nim.charAt(6)));

        switch (nimCode) {
            case 2: prodi = "Teknik Informatika"; break;
            case 3: prodi = "Teknik Komputer"; break;
            case 4: prodi = "Sistem Informasi"; break;
            case 6: prodi = "Pendidikan Teknologi Informasi"; break;
            case 7: prodi = "Teknologi Informasi"; break;
        }
        return prodi + ", " + angkatan;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNim : " + nim + "\nIPK : " + ipk + "\nStatus : " + getStatus();
    }
}