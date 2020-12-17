/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;
//menginport scanner
/**
 *
 * @author Aldy
 */
public class DataKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, alamat;
        int usia, gaji ;
        
        //membust scanner baru
        Scanner AHA = new Scanner(System.in);
        
        //tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama karyawan : ");
        
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = AHA.next();
        
        // tampilkan output lagi
        System.out.print("Alamat:");
        
        //menggunakan scanner lagi
        alamat = AHA.next();
        
        System.out.println("Usia: ");
        usia = AHA.nextInt();
        
        System.out.println("Gaji: ");
        gaji = AHA.nextInt();
        
        // Menampilkn apa yg sudah disimpan divaribel
        System.out.println("-----------------------");
        System.out.println("Nama Karyawan: "+ nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Usia: "+ usia + "tahun" );
        System.out.println("Gaji: Rp " + gaji);
        
        
    }
    
}
