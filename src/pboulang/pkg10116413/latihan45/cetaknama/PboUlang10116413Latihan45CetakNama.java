/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 * DESKRIPSI    : Program ini menampilkan Cetak nama
 */
public class PboUlang10116413Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        Printer objP = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda : ");
        objP.setNama(scan1.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        objP.setJmlCetak(scan2.nextInt());
        objP.cetak(objP.getNama());
        System.out.println("Hasil Cetak : ");
        objP.cetak(objP.getJmlCetak(), objP.getNama());
        
    }
    
}