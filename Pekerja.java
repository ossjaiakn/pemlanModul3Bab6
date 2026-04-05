package PraktikumPemlan;

import java.time.LocalDate;
import java.time.Period;

//Ahmad Dzaikra Javier
//255150301111025
//TI-A
public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String NIK, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, NIK, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate tahunMasuk() {
        return tahunMasuk;
    }

    public int jumlahAnak() {
        return jumlahAnak;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20);
    }

    @Override
    public double getPendapatan() {
        return getGaji() + getTunjangan() + getBonus();
    }

    public double getBonus() {
        double bonus = 0;
        int lamaKerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        if (lamaKerja <= 5) {
            bonus = gaji * 0.05;
        } else if (lamaKerja > 5 && lamaKerja <= 10) {
            bonus = gaji * 0.1;
        } else {
            bonus = gaji * 0.15;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + 
                ", Tahun masuk " + tahunMasuk +
                ", Jumlah anak " + jumlahAnak +
                ", Gaji " + gaji;
    }
}
