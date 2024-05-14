package BONUS;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Davis", 20, true, "123456", 3.9, 8);
        Resepsionis resepsionis = new Resepsionis("Ani", 25, false, 1111, "Koordinator", 3000.0);
        Dosen dosen = new Dosen("Dr. Davis", 45, true, "987654", 5000000.0);
        Asprak asprak = new Asprak("Kak Devan dan Kak Aldo", 21, false, "234567", 3.8, 1);

        Civitas civitasMahasiswa = mahasiswa;
        System.out.println("=============================INFORMASI  MAHASISWA================================");
        mahasiswa.ngerjainTugas();
        civitasMahasiswa.naikLift();
        mahasiswa.pasrah();
        mahasiswa.presentasi();
        mahasiswa.mengikutiOrganisasi("Davis");
        System.out.println("=================================================================================");

        Civitas civitasResepsionis = resepsionis;
        System.out.println("============================INFORMASI  RESEPSIONIS===============================");
        civitasResepsionis.makanDiKantin("Main");
        resepsionis.melayani();
        resepsionis.melapor();
        System.out.println("=================================================================================");

        Civitas civitasDosen = dosen;
        PesertaKelas pesertaKelasDosen = dosen;
        Pengajar pengajarDosen = dosen;
        System.out.println("===============================INFORMASI  DOSEN==================================");
        dosen.mengajar("PBO");
        civitasDosen.mainGameCorner();
        pesertaKelasDosen.masukKelas();
        pengajarDosen.menilaiTugas();
        pengajarDosen.mengasihTugas();
        dosen.ikutPenelitian();
        System.out.println("=================================================================================");
        
        Pengajar pengajarAsprak = asprak;
        System.out.println("===============================INFORMASI  ASPRAK=================================");
        asprak.ngasihKomenDiGCR();
        pengajarAsprak.mengasihTugas();
        pengajarAsprak.mengajar("Praktikum PBO");
        pengajarAsprak.menilaiTugas();
        asprak.naikLift();
        System.out.println("=================================================================================");
    }
}
