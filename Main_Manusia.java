package PraktikumPemlan;

import java.time.LocalDate;


public class Main_Manusia {
    public static void main(String[] args) {
        Manusia m1 = new Manusia("Javi", true, "255150201", true);
        Manusia m2 = new Manusia("Cyril", false, "2812391040", true);
        Manusia m3 = new Manusia("Kar", true, "34729749280", false);
        System.out.println("=== DATA MANUSIA ===");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println();

        MahasiswaFILKOM mF1 = new MahasiswaFILKOM("El", true, "72824824247", false, "255150301111023", 2.4);
        MahasiswaFILKOM mF2 = new MahasiswaFILKOM("Ol", false, "72824824246", false, "255150301111024", 3.4);
        MahasiswaFILKOM mF3 = new MahasiswaFILKOM("Javier", true, "72824824245", false, "255150301111025", 3.97);
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println(mF1);
        System.out.println(mF2);
        System.out.println(mF3);
        System.out.println();

        Pekerja p1 = new Pekerja("Kari", false, "283782474870", true, 40.0, LocalDate.of(2024, 1, 1), 2);
        Pekerja p2 = new Pekerja("opor", false, "283782474871", false, 50.0, LocalDate.of(2017, 1, 1), 0);
        Pekerja p3 = new Pekerja("rend", false, "283782474872", true, 40.0, LocalDate.of(2006, 1, 1), 10);
        System.out.println("=== DATA PEKERJA ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        Manager mgr = new Manager("jenn", true , "45498464987", false, 7500, LocalDate.of(2011, 1, 1), 0, "Gabrak");
        System.out.println("=== DATA MANAGER ===");
        System.out.println(mgr);

    }
}