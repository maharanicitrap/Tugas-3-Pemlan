public class Matakuliah {

    private String Kode;
    private String NamaMK;
    private int Nilaiangka;

    public String getKode() {
        return Kode;
    }

    public void setKode(String kode) {
        Kode = kode;
    }

    public String getNamaMK() {
        return NamaMK;
    }

    public void setNamaMK(String namaMK) {
        NamaMK = namaMK;
    }
    public int getNilaiangka() {
        return Nilaiangka;
    }

    public void setNilaiangka(int nilaiangka) {
        Nilaiangka = nilaiangka;
    }

    public String getNilaiHuruf() {
        if (Nilaiangka >= 80) {
            return "A";
        } else if (Nilaiangka >= 70) {
            return "B";
        } else if (Nilaiangka >= 60) {
            return "C";
        } else if (Nilaiangka >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}