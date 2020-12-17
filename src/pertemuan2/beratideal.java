/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author Aldy
 */
public class beratideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner aldy = new Scanner (System.in);
        int pilihan, berat, tinggi;
        double ideal,ideal2,ideal3;
        System.out.println("===========-=-=-=-=-===============");
        System.out.println("Program Menghitung Berat Badan Ideal");
        System.out.println("================--=-=-=-=============");
        System.out.println("Masukan berat badan anda [kg] :");
        berat = aldy.nextInt();
        System.out.println("Masukan Tinggi badan anda [cm] :");
        tinggi = aldy.nextInt();
        System.out.println("\nJenis Kelamin\n");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.println("\nPilihan :");
        pilihan = aldy.nextInt();
        
        switch (pilihan){
            case 1:
                ideal = ((tinggi - 100) - 0.1* (tinggi - 100));
                ideal2 = berat - ideal;
                ideal3 = ideal - berat;
                System.out.println("Berat ideal untuk tinggi anda adalah "+ideal);
                break;
                
                case 2:
                ideal = ((tinggi - 100) - 0.153* (tinggi - 100));
                ideal2 = berat - ideal;
                ideal3 = ideal - berat;
                System.out.println("Berat ideal untuk tinggi anda adalah "+ideal);
                break;
        }
    }
    
}
