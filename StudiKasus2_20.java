import java.util.Scanner;

public class StudiKasus2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data umum
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine();

        // Pengecekan jenis kegiatan (Level 1)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = input.nextInt();
            
            System.out.print("Peringkat juara : ");
            int peringkat = input.nextInt();

            // Pengecekan peringkat juara (Level 2)
            if (peringkat >= 1 && peringkat <= 3) {
                // Pengecekan kelengkapan dokumen (Level 3)
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memenuhi syarat juara (harus Juara 1, 2, atau 3). Dana penghargaan tidak diberikan.");
            }

        } 
    }   
}
