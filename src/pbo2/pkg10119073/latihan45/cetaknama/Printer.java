package pbo2.pkg10119073.latihan45.cetaknama;

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

public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama =nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : "+nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        int i = 1;
        System.out.println("Hasil Cetak : ");
        while(i <= jmlCetak ){
            System.out.println(i+". "+nama);
            i++;
        }
    }
}
