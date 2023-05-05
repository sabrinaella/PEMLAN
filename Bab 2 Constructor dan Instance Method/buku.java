public class buku {
    private String kategori;
    private String judul;
    private int tahun;
    private String penulis;
    private String sinopsis;
    private int jumlahKata = 0;

    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setTahun(int i){
        this.tahun = i;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    public void setJumlahKata(int jumlahKata){
        this.jumlahKata = sinopsis.split("\\s+").length;
    }
    
    public void tampilkan(){
        System.out.println("====================================");
        System.out.println("Kategori\t\t: " + kategori);
        System.out.println("Judul\t\t\t: " + judul);
        System.out.println("Tahun\t\t\t: " + tahun);
        System.out.println("Penulis\t\t\t: " + penulis);
        System.out.println("Sinopsis\t\t: " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis\t: " + jumlahKata);
        System.out.println("====================================");
        System.out.println();
    }
}