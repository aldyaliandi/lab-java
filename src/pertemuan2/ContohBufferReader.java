package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aldy
 */
public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
     String nama;
     int Usia;
     
     //Membuat objek inputstream
     InputStreamReader isr = new InputStreamReader(System.in);
     
     //Membuat objek bufferreader
     BufferedReader br = new BufferedReader (isr);
     
     // Mengisi variabel nama dan Usia dengan Buffereader
     System.out.print("Inputkan nama: ");
     nama = br.readLine();
     
     System.out.print("Masukan Usia: ");
     Usia = br.read();
     
   
     // tampilkan output isi variabel nama dan Usia
     System.out.println("===================================");
     System.out.println("Nama Kamu siapa beb yaitu " + nama);
     System.out.println("Usia Kamu beb yaitu " + Usia);
    }
    
}
