/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthitungharga2;

/**
 *
 * @author asus
 */
public class ProjectHitungHarga2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik(30, 30, 5400);
        k1.totalJumlah();
        System.out.println("Harga keramik A : Rp." + k1.totalHarga());
        
        Keramik k2 = new Keramik(40, 40, 13000);
        k2.totalJumlah();
        System.out.println("Harga keramik B : Rp." + k2.totalHarga());
        
        Keramik k3 = new Keramik(30, 40, 7500);
        k3.totalJumlah();
        System.out.println("Harga keramik C : Rp." + k3.totalHarga());
    } 
}