/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan59;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karakter k = new Karakter();
        String[] karakter_utama = {"Shinichi Kudo", "Kogoro Mouri"};
        KarakterUtama u = new KarakterUtama(karakter_utama);
        String[] karakter_pendukung = {"Eisuke Hondo", "Eri Kisaki", "Heiji Hattori", "Kazuha Toyama", "Kid si Pencuri"};
        KarakterPendukung p = new KarakterPendukung(karakter_pendukung);
        System.out.println("===Daftar Karater Utama===");
        System.out.println("Sebelum Ditambahkan Ran");
        u.tampilKarakter();
        u.tambahKarakterUtama("Ran Mouri");
        System.out.println("\nSesudah Ditambahkan Ran");
        u.tampilKarakter();
        k.setTokoh(u.getKarakterUtama());
        
        System.out.println("\n===Daftar Karater Pendukung===");
        System.out.println("Sebelum Kid si Pencuri dihapus");
        p.tampilKarakter();
        p.hapusKarakterPendukung(4);
        System.out.println("\nSesudah Kid si Pencuri dihapus");
        p.tampilKarakter();
//        k.setTokoh(p.getKarakterPendukung());
        k.setTokoh(k.Merge(u.getKarakterUtama(), p.getKarakterPendukung()));
        System.out.println("\n===Daftar Semua Karakter===");
        k.tampilKarakter();
    }

}
