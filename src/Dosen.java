package BONUS;

public class Dosen extends Civitas implements PesertaKelas, Pengajar{
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public void ikutPenelitian() {
        System.out.println("Dosen dengan " + nip + " sedang mengikuti penelitian");
    }
    
    public void masukKelas(){
        System.out.println("Dosen yang memiliki " + gaji + " sedang masuk kelas");
    }

    public void mengajar(String matkul) {
        System.out.println("Dosen sedang mengajar " + matkul);
    }
    public void mengasihTugas(){
        System.out.println("Dosen sedang memberikan tugas");
    }
    public void menilaiTugas() {
        System.out.println("Dosen sedang menilai tugas");
    }
}
