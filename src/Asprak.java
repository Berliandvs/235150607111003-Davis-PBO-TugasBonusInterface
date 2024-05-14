package BONUS;

public class Asprak extends Mahasiswa implements Pengajar{
    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }
    
    public void ngasihKomenDiGCR() {
        System.out.println("Asprak sedang melakukan komen di Google Classroom");
    }
    public void mengajar(String matkul) {
        System.out.println("Asprak sedang mengajar " + matkul);
    }
    public void mengasihTugas(){
        System.out.println("Asprak sedang memberikan tugas");
    }
    public void menilaiTugas() {
        System.out.println("Asprak sedang menilai tugas");
    }
}
