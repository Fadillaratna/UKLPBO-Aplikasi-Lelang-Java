package lelang;

import java.util.Scanner;

public class AplikasiLelang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        Masyarakat masyarakat1 = new Masyarakat();
        Petugas petugas1 = new Petugas();
        Lelang lelang1 = new Lelang();
        Laporan laporan1 = new Laporan();
        
        laporan1.laporan(petugas1);
        System.out.print("Masukkan ID Petugas : ");
        int id = a.nextInt();
        System.out.println("Selamat datang " + petugas1.getNama(id));
                
        System.out.println("");
        
        Barang barang1 = new Barang();
        laporan1.laporan(masyarakat1);
        lelang1.prosesLelang(petugas1, masyarakat1, lelang1, barang1, laporan1);
        laporan1.laporan(barang1);
//        laporan1.laporan(masyarakat1, barang1); 
    }
}