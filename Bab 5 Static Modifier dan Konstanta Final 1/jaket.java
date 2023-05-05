public class jaket {
    private final int JaketA, JaketB, JaketC; 
    private int totalBayar;
    public jaket (int HrgJktA, int HrgJktB, int HrgJktC) { 
        JaketA = HrgJktA;
        JaketB = HrgJktB;
        JaketC = HrgJktC;
    }
    public int getJaketA() { 
        return JaketA;
    }
    public int getJaketB() {
        return JaketB;
    }
    public int getJaketC() { 
        return JaketC;
    }
    
    public void Beli (int pilih, int jumlah) { 
        if (pilih == 1) {
            totalBayar = getJaketA() * jumlah; System.out.println("Harga per Jaket A : Rp." + getJaketA());
        } else if (pilih == 2) {
            totalBayar = getJaketB()* jumlah; System.out.println("Harga per Jaket B : Rp." + getJaketB());
        } else if (pilih == 3) {
            totalBayar = getJaketC () * jumlah;
            System.out.println("Harga per Jaket C : Rp." + getJaketC());
        }
        System.out.println("Total Harga " + jumlah + " jaket : Rp." + totalBayar);
    }
}