package pbo3ulang.pkg10116049.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Menampilkan Huruf Kapital atau Kecil
 */
public class PBO3ULANG10116049Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat;
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + Kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + Kalimat.toLowerCase());
    }
    
}
