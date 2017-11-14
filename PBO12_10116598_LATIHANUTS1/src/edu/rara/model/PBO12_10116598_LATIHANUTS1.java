/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rara.model;

/**
 *
 * @author user Raudhatul Ula Camalia (10116598) PBO12
 */
public class PBO12_10116598_LATIHANUTS1 {

    /**
     * @param args the command line arguments
     */
    String nim;
    String nama;
    
    public void modelMahasiswa(String nim, String nama){
        System.out.println("NIM :" +getNim() );
        System.out.println("NAMA    :" +getNama());
        
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
