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
public class KarakterPendukung extends Karakter{

    protected List<String> tokoh_pendukung = new ArrayList<String>();

    KarakterPendukung(String karakter[]) {
        String tokoh_temporary[][] = new String[1][karakter.length];
        int i = 0;
        for (String nama : karakter) {
            tokoh_temporary[0][i] = nama;
            tokoh_pendukung.add(nama);
            i++;
        }
    }
    
    @Override
    public void tampilKarakter(){
        for (String karakter : this.tokoh_pendukung) {
            System.out.println("Nama Karakter Pendukung : "+karakter);
        }
    }
    
    public String[][] getKarakterPendukung(){
        String tokoh_temporary[][] = new String[1][tokoh_pendukung.size()];
        int i = 0;
        for (String nama : tokoh_pendukung) {
            tokoh_temporary[0][i] = nama;
            i++;
        }
        return tokoh_temporary;
    }
    
    public void tambahKarakterPendukung(String nama){
        this.tokoh_pendukung.add(nama);
        String tokoh_temporary[][] = new String[1][tokoh_pendukung.size()];
        int i = 0;
        for (String name : tokoh_pendukung) {
            tokoh_temporary[0][i] = name;
            i++;
        }
        setTokoh(tokoh_temporary);
    }
    
    public void hapusKarakterPendukung(int noChara){
        this.tokoh_pendukung.remove(noChara);
        String tokoh_temporary[][] = new String[1][tokoh_pendukung.size()];
        int i = 0;
        for (String name : tokoh_pendukung) {
            tokoh_temporary[0][i] = name;
            i++;
        }
        setTokoh(tokoh_temporary);
    }
    
}
