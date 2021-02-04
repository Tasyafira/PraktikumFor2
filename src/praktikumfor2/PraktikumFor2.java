/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumfor2;

/**
 *
 * @author MOKLET-1
 */
public class PraktikumFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        System.out.println("PROGRAM MENAMPILKAN @ BERBENTUK SEGITIGA SIKU-SIKU");
        System.out.println("---------------------------------------------");
        
        // Perulangan 
        // i = 0, i Kurang Dari 5, Maka i++ (Perulangan dimulai dari 0 dan akan terus bertambah sampai kurang dari 5)
        for (i=0; i<5; i++) {
            
            // j = 0, j Kurang Dari i, Maka j++ (Perulangan dimulai dari 0 dan akan terus bertambah sampai kurang dari i)
            for (j=0; j<i; j++){
                
                // Menampilkan Hasil dari Perulangan
                System.out.print("@");
            }
            System.out.print("\n");
            }
    }
    
}
