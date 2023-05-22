public class Main {
    public static void main(String[] args) {
        System.out.println("============== DAFTAR KUE ==============");
        Kue[] kueArray = new Kue[20];
        // Isikan 20 objek kue dengan berbagai jenis kue
        kueArray[0] = new KuePesanan("Bolu", 200, 50);
        kueArray[1] = new KueJadi("Salad", 150, 30);
        kueArray[2] = new KuePesanan("Kue Coklat", 150, 50);
        kueArray[3] = new KueJadi("Kue Lumpur", 50, 40);
        kueArray[4] = new KuePesanan("Roti Red Velvet", 1000, 300);
        kueArray[5] = new KueJadi("Lemper", 50, 30);
        kueArray[6] = new KuePesanan("Cheese Cake", 500, 100);
        kueArray[7] = new KueJadi("Oreo Cake", 600, 300);
        kueArray[8] = new KuePesanan("Putri Salju", 150, 50);
        kueArray[9] = new KueJadi("Lapis Legit", 700, 500);
        kueArray[10] = new KuePesanan("Cinnamon Roll", 200, 50);
        kueArray[11] = new KueJadi("Kue Mangkok", 100, 50);
        kueArray[12] = new KuePesanan("Roti Pandan", 400, 60);
        kueArray[13] = new KueJadi("Apple Pie", 300, 100);
        kueArray[14] = new KuePesanan("Kue Sus", 50, 30);
        kueArray[15] = new KueJadi("Rainbow Cake", 800, 500);
        kueArray[16] = new KuePesanan("Kue Kering", 140, 90);
        kueArray[17] = new KueJadi("Brownis", 250, 50);
        kueArray[18] = new KuePesanan("Donat", 50, 20);
        kueArray[19] = new KueJadi("Banana Bread", 250, 150);

        // Tampilkan semua kue beserta jenisnya
        for (Kue kue : kueArray) {
            System.out.println(kue.toString());
            System.out.println("Jenis Kue : " + kue.getClass().getSimpleName());
            System.out.println();
        }

        // Hitung total harga dari semua jenis kue
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("========================================");
        System.out.println("");
        System.out.println("========= DETAIL INFORMASI KUE =========");
        System.out.println("Total Harga Semua Kue   : Rp " + totalHarga);

        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan : Rp " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan : " + totalBeratPesanan);

        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi    : Rp " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi   : " + totalJumlahJadi);

        // Temukan kue dengan harga terbesar
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;

        for (Kue kue : kueArray) {
            double harga = kue.hitungHarga();
            if (harga > hargaTerbesar) {
                hargaTerbesar = harga;
                kueTerbesar = kue;
            }
        }

        if (kueTerbesar != null) {
            System.out.println("");
            System.out.println("Kue dengan Harga Terbesar");
            System.out.println(kueTerbesar.toString());
            System.out.println("Jenis Kue : " + kueTerbesar.getClass().getSimpleName());
            System.out.println("========================================");
        }
    }
}