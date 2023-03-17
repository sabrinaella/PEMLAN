public class buku {
    private String kategori;
    private String judul;
    private int tahun;
    private String penulis;

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
    public void tampilkan(){
        System.out.println("====================================");
        System.out.println("Kategori : " + kategori);
        System.out.println("Judul    : " + judul);
        System.out.println("Tahun    : " + tahun);
        System.out.println("Penulis  : " + penulis);
        System.out.println("====================================");
        System.out.println();
    }
}