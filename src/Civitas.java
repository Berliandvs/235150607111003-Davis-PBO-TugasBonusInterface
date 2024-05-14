package BONUS;

public abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " sedang makan di " + kantin + " kantin ");
    }

    public void mainGameCorner() {
        System.out.println(nama + " sedang bermain game di game corner dengan mahasiswa berumur " +umur);
    }

    public void naikLift() {
        System.out.println(nama + " sedang menggunakan lift "+jenisKelamin);
    }
}
