package BONUS;

public class Mahasiswa extends Civitas implements PesertaKelas{
    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }
    public void ngerjainTugas() {
        System.out.println("Mahasiswa dengan nim " + nim + " sedang mengerjakan tugas di RKB");
    }

    public void pasrah() {
        System.out.println("Mahasiswa yang memiliki " + ipk + " sedang menyerah karena memiliki pressure dengan " +golUkt);
    }

    public void mengikutiOrganisasi(String nama){
        System.out.println("Mahasiswa " + nama + " mengikuti organiasasi kampus");
    }

    public void presentasi() {
        System.out.println("Mahasiswa sedang melakukan presentasi");
    }

    public void masukKelas(){
        System.out.println("Mahasiswa sedang datang di kelas");
    }
}
