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
public class Karakter {
    
    protected String tokoh[][];

    public void setTokoh(String[][] tokoh) {
        this.tokoh = tokoh;
    }

    public String[][] getTokoh() {
        return tokoh;
    }
    
    public void tampilKarakter(){
        int no = 1;
        for (String[] i : tokoh) {
            for (String nama : i) {
                if (nama != null) {
                    System.out.println(no+". " + nama);
                    no++;
                }
            }
        }
    }
    
    public String[][] Merge(String[][] arr1, String[][] arr2){
        String[][] tmp = new String[2][(arr1[0].length+arr2[0].length)];
        int i = 0;
        for (String[] strings : arr1) {
            for (String string : strings) {
                tmp[0][i] = string;
                i++;
            }
        }
        for (String[] strings : arr2) {
            for (String string : strings) {
                tmp[1][i] = string;
                i++;
            }
        }
        return tmp;
    }
    
}
