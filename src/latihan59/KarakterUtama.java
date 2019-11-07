/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan59;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class KarakterUtama extends Karakter{
    
//    protected String[] tokoh_utama;
    protected List<String> tokoh_utama = new ArrayList<String>();

    KarakterUtama(String karakter[]) {
        String tokoh_temporary[][] = new String[1][karakter.length];
        int i = 0;
        for (String nama : karakter) {
            tokoh_temporary[0][i] = nama;
            tokoh_utama.add(nama);
            i++;
        }
    }
    
    public String[][] getKarakterUtama(){
        String tokoh_temporary[][] = new String[1][tokoh_utama.size()];
        int i = 0;
        for (String nama : tokoh_utama) {
            tokoh_temporary[0][i] = nama;
            i++;
        }
        return tokoh_temporary;
    }
    
    @Override
    public void tampilKarakter(){
        String tokoh_temporary[][] = new String[1][tokoh_utama.size()];
        for (String nama : tokoh_utama) {
            System.out.println("Nama Karakter Utama : "+nama);
        }
    }
    
    public void tambahKarakterUtama(String nama){
        this.tokoh_utama.add(nama);
        String tokoh_temporary[][] = new String[1][tokoh_utama.size()];
        int i = 0;
        for (String name : tokoh_utama) {
            tokoh_temporary[0][i] = name;
            i++;
        }
        setTokoh(tokoh_temporary);
    }
    
    public void hapusKarakterUtama(int noChara){
        this.tokoh_utama.remove(noChara);
        String tokoh_temporary[][] = new String[1][tokoh_utama.size()];
        int i = 0;
        for (String name : tokoh_utama) {
            tokoh_temporary[0][i] = name;
            i++;
        }
        setTokoh(tokoh_temporary);
    }
    
}
