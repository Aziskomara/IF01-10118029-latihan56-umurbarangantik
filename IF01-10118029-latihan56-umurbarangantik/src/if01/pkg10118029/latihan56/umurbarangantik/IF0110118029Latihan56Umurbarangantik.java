/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan56.umurbarangantik;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Umur Barang Antik
 */
public class IF0110118029Latihan56Umurbarangantik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        radio radio = new radio(234);
        radio.setName("Radio AM");
        radio.tampilUmur();
        System.out.println("Nama Barang Antik : " + radio.getName());
    }
    
}
