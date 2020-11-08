package pboif2.pkg10119049.latihan42.tabungan;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program penarikan uang
*/

import Bank.Tabungan; // import from tabungan
import java.util.Scanner;
public class PBOIF210119049Latihan42Tabungan {   
    public static void main(String[] args) {
        // inst. object
        Scanner scan = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        // var
        int kredit;
        
        System.out.print("===Program Penarikan Uang====\n");
        System.out.printf("Masukkan Saldo Awal : "); tabungan.Tabungan(scan.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scan.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.ambilUang(kredit));
        
    }
    
}
