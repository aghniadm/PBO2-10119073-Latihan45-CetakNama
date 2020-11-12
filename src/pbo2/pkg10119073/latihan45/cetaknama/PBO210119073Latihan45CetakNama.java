package pbo2.pkg10119073.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghasilkan cetakan nama hingga 
 * beberapa kali
 *
 */

public class PBO210119073Latihan45CetakNama {

    public static void main(String[] args) {
        Printer printer = new Printer();
        
        System.out.println("======Aplikasi Pencetak Nama======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda : ");       
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
