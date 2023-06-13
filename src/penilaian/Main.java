
package penilaian;


public class Main {
    public static void main(String[] args) {
        NilaiAkhir arif = new NilaiAkhir("Arif Budiman", "2110010361", 90,90,95);
        
        System.out.println("Nama : " + arif.getNama());
        System.out.println("NPM : " + arif.getNpm());
        System.out.println("Nilai Akhir : " + arif.hitungNilaiAkhir());
    }
 
}
