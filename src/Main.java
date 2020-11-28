/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi program dari garis lurus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Koordinat Koordinat1 = new Koordinat(2,10,5,7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%n", Koordinat1.getX1(),Koordinat1.getY1(),Koordinat1.getX2(),Koordinat1.getY2());
        System.out.println("Memiliki gradien sebesar" + Koordinat1.hitungGradien());
        
        Koordinat Koordinat2 = new Koordinat(5,1,3,12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%n",  Koordinat2.getX1(), Koordinat2.getY1(), Koordinat2.getX2(), Koordinat2.getY2());
        System.out.printf("Memuliki gradien sebesar " + Koordinat2.hitungGradien());
    }
    
}
