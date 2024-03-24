import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] a) {
        ArrayList Mahasiswas = new ArrayList();

        Scanner Citra = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("Masukkan NIM : ");
            String NIM = Citra.nextLine();

            System.out.print("Masukkan Nama : ");
            String Nama = Citra.nextLine();

            Mahasiswa mhs = new Mahasiswa();
            mhs.setNIM(NIM);
            mhs.setNama(Nama);
            ArrayList <Matakuliah> matakuliah = new ArrayList();
            boolean nextMatakuliah = true;
            while (nextMatakuliah) {
                System.out.print("Masukkan Kode : ");
                String Kode = Citra.nextLine();

                System.out.print("Masukkan Nama Mata Kuliah : ");
                String NamaMK = Citra.nextLine();

                System.out.print("Masukkan Nilai (angka) : ");
                int Nilaiangka = Citra.nextInt();
                Citra.nextLine();

                Matakuliah mataKuliah = new Matakuliah();
                mataKuliah.setKode(Kode);
                mataKuliah.setNamaMK(NamaMK);
                mataKuliah.setNilaiangka(Nilaiangka);
                matakuliah.add(mataKuliah);
                System.out.print("Tambah Mata Kuliah?");
                String tambahMatakuliah = Citra.nextLine();

                if (tambahMatakuliah.equals("Tidak")) {
                    nextMatakuliah = false;
                }
            }

            mhs.setMatakuliah (matakuliah);
            Mahasiswas.add(mhs);
            System.out.print("Tambah lagi? ");
            String tambah = Citra.nextLine();

            if (tambah.equals("Tidak")) {
                next = false;
            }
        }
        System.out.println("====================================");
        for (int i = 0; i < Mahasiswas.size(); i++) {
            Mahasiswa mhs = (Mahasiswa) Mahasiswas.get(i);
            System.out.println(mhs.getNIM() + "|" + mhs.getNama()
                    + "|" + mhs.getMatakuliah());
            ArrayList matakuliah = mhs.getMatakuliah();
            for (int j = 0; j < matakuliah.size(); j++) {
                Matakuliah mk = (Matakuliah) matakuliah.get(j);
                System.out.println(" - |" + mk.getKode() + "|" + mk.getNamaMK()
                        + "|" + mk.getNilaiHuruf());
            }
        }
    }
}