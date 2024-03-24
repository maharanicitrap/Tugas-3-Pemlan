import java.util.ArrayList;
public class Mahasiswa {

    private String NIM;
    private String Nama;
    private ArrayList Matakuliah = new ArrayList();

    public ArrayList getMatakuliah() {
        return Matakuliah;
    }

    public void setMatakuliah(ArrayList Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}

