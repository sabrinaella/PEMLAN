public class mainProgram {
    public static void main(String[] args) {
        // testcase - output
        Manusia a = new Manusia("Sabrina", "111", true, true);
        mahasiswaFilkom b = new mahasiswaFilkom("165150300111100", 4.0, "Ella", "111", false, false);
        pekerja c = new pekerja(1000, 2016, 3, 2, 4, "Zafira", "111", true, true);
        manager d = new manager("HRD", 1000, 2017, 1, 2, 3, "Elsa", "111", true, true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // testcase
        Manusia a1 = new Manusia("Kamisato Ayato", "111", true, true);
        Manusia a2 = new Manusia("Kamisato Ayaka", "111", false, true);
        Manusia a3 = new Manusia("Kaeya", "111", true, false);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        mahasiswaFilkom b1 = new mahasiswaFilkom("205150400111100", 2.9, "Getou", "111", false, false);
        mahasiswaFilkom b2 = new mahasiswaFilkom("215150200111100", 3.4, "Gojo", "111", true, false);
        mahasiswaFilkom b3 = new mahasiswaFilkom("225150701111029", 3.6, "Anna", "111", false, false);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        pekerja p1 = new pekerja(11000, 2021, 5, 10, 2, "Lala", "111", true, true);
        pekerja p2 = new pekerja(15000, 2014, 2, 14, 0, "Lili", "111", false, false);
        pekerja p3 = new pekerja(20000, 2003, 1, 20, 10, "Lulu", "111", true, true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3); 

        manager mn = new manager("HRD", 7500, 2008, 3, 3, 5, "Nanas", "111", true, true);
        System.out.println(mn);

    }
}