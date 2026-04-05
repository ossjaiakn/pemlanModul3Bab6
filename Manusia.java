package PraktikumPemlan;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true : laki-laki ; false : perempuan
    private String NIK;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String NIK, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.NIK = NIK;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String NIK) {
        this.NIK = NIK;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNik() {
        return NIK;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        double tunjangan = 0;
        if (jenisKelamin) {
            if (menikah) {
                tunjangan = 25;
            } else {
                tunjangan = 15;
            }
        } else {
            if (menikah) {
                tunjangan = 20;
            } else {
                tunjangan = 15;
            }
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama " + nama + 
                ", NIK " + NIK +
                ", Jenis Kelamin " + jenisKelamin +
                ", Jumlah pendapatan " + getPendapatan();
    }
}
