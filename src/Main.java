package BONUS;

public class Main {
    public static void main(String[] args) {
        // Instantiate each concrete class
        Mahasiswa mahasiswa = new Mahasiswa("Budi", 20, true, "123456", 3.5, 2);
        Resepsionis resepsionis = new Resepsionis("Ani", 25, false, 1, "Chief", 3000.0);
        Dosen dosen = new Dosen("Dr. Ahmad", 45, true, "987654", 5000.0);
        Asprak asprak = new Asprak("Rani", 21, false, "234567", 3.8, 1);

        // Upcasting examples
        Civitas civitasMahasiswa = mahasiswa;
        Civitas civitasResepsionis = resepsionis;
        Civitas civitasDosen = dosen;
        PesertaKelas pesertaKelasDosen = dosen;
        Pengajar pengajarDosen = dosen;
        Pengajar pengajarAsprak = asprak;

        // Call methods to demonstrate functionality
        mahasiswa.ngerjainTugas();
        resepsionis.melayani();
        dosen.mengajar("OOP");
        asprak.ngasihKomenDiGCR();

        // Upcasted objects calling methods
        civitasMahasiswa.naikLift();
        civitasResepsionis.makanDiKantin("Main");
        civitasDosen.mainGameCorner();
        pesertaKelasDosen.masukKelas();
        pengajarDosen.menilaiTugas();
        pengajarAsprak.mengasihTugas();
    }
}