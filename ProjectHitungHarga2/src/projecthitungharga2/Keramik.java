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
public class Keramik {
    int panjang1;
    int panjang2;
    int harga;
    
    /* constructor */
    Keramik(int p1, int p2, int p3){
        this.panjang1 = p1;
        this.panjang2 = p2;
        this.harga = p3;
    }
    /* methods */
    int totalJumlah(){
        int jumlah;
        jumlah = 1000000 / (this.panjang1 * this.panjang2);
        return jumlah;
    }
    
    int totalHarga(){
        int biaya;
        biaya = totalJumlah() * this.harga;
        return biaya;
    }
}