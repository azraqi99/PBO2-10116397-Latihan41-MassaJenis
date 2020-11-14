/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Massa Jenis
 */
package pbo210116397latihan41massajenis;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kubus cube = new Kubus();
        System.out.println("=====Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        Scanner scn = new Scanner(System.in);
        int sisi = scn.nextInt();
        System.out.print("Massa: ");
        int massa = scn.nextInt();

        cube.setSisi(sisi);
        cube.setMassa(massa);
        int totVolume = cube.hitungVolume(sisi);

        System.out.println("=====Hasil Perhitungan======");
        System.out.println("Volume : " + totVolume);

        System.out.println("Massa Jenis : " + cube.hitungMassaJenis(massa, totVolume));
       
    }
    
}
