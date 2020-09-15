/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthitungharga;

/**
 *
 * @author asus
 */
public class ProjectHitungHarga {
    /* atribut */
    int panjang1;
    int panjang2;
    int harga;
    
    /* methods */
    void totalHarga(){
        int jumlah;
        jumlah = 1000000 / (this.panjang1 * this.panjang2);
        int biaya;
        biaya = jumlah * this.harga;
        System.out.println("Harga : Rp." + biaya);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* method */
        /* keramik A */
        ProjectHitungHarga p1 = new ProjectHitungHarga();
        p1.panjang1 = 30;
        p1.panjang2 = 30;
        p1.harga = 5400;
        p1.totalHarga();
        
        /* keramik B */
        ProjectHitungHarga p2 = new ProjectHitungHarga();
        p2.panjang1 = 40;
        p2.panjang2 = 40;
        p2.harga = 13000;
        p2.totalHarga();
        
        /* keramik C */
        ProjectHitungHarga p3 = new ProjectHitungHarga();
        p3.panjang1 = 30;
        p3.panjang2 = 40;
        p3.harga = 7500;
        p3.totalHarga();
    }
}