package PraktikumPemlan;

public class MahasiswaFILKOM extends Manusia{
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String NIK, boolean menikah, String NIM, double IPK) {
        super(nama, jenisKelamin, NIK, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String angkatan =  "20" + NIM.substring(0, 2);

        char kodeProdi = NIM.charAt(6);

        String prodi;

        switch (kodeProdi) {
            case '2' : 
                prodi = "Teknik Informatika";
                break;
            case '3' :
                prodi = "Teknik Komputer";
                break;
            case '4' :
                prodi = "Sistem Informasi";
                break;
            case '6' :
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7' :
                prodi = "Teknologi Informasi";
                break;
            default :
                prodi = "Error";
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (IPK >= 3.0 && IPK <= 3.5) {
            beasiswa = 50;
        } else if (IPK > 3.5 && IPK <= 4) {
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + 
                ", NIM : " + NIM + 
                ", IPK : " + IPK +
                ", Status : " + getStatus();
    }
}
