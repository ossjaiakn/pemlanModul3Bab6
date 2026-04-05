package PraktikumPemlan;

import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String NIK, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak, 
                   String departemen) {
        super(nama, jenisKelamin, NIK, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (getGaji() * 0.1);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Departemen " + departemen;
    }
}
