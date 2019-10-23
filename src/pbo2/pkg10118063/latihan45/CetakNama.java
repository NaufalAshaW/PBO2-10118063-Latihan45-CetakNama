/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan45;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Printer printer = new Printer();
       
        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukkan Nama Anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau Cetak Berapa kali? : ");
        printer.setJmlCetak(scanner.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
