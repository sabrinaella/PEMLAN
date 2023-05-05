import java.util.Scanner;
public class mainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        jaket HrgJkt = new jaket (100000, 125000, 175000);
        jaket HrgJktDsc = new jaket (95000, 120000, 160000);
        System.out.println("Pilih jaket yang akan dibeli :"); System.out.println(" 1. Jaket A \n 2. Jaket B \n 3. Jaket C");
        System.out.print ("Masukkan angka pilihan : ");
        int pilih = input.nextInt();
        if (pilih > 0 && pilih < 4) {
            System.out.print ("Masukkan Jumlah Jaket : ");
            int jumlah = input.nextInt(); 
            if (jumlah < 100) {
                HrgJkt.Beli (pilih, jumlah);
            } else {
                HrgJktDsc.Beli (pilih, jumlah);
            }
        } else {
            System.out.println("Maaf, Inputan tidak sesuai, [Input 1, 2 atau 3]");
        }
        input.close();
    }
}