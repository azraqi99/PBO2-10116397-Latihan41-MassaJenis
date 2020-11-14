/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Massa Jenis
 */
package pbo210116397latihan41massajenis;

/**
 *
 * @author Zetro
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi) {
        return sisi * sisi * sisi;

    }

    public int hitungMassaJenis(int Massa, int volume) {
        return Massa / volume;
}
}
