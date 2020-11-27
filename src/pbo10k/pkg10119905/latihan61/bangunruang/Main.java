/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119905.latihan61.bangunruang;

/**
 *
 * @author aruma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola objBola = new Bola();
        objBola.setJarijari(7);
        System.out.printf("Volume Bola adalah \t = %.2f%n", objBola.hitungVolume());
        
        Tabung objTabung = new Tabung();
        objTabung.setJarijari(10);
        objTabung.setTinggi(21);
        System.out.printf("Volume Tabung adalah \t = %.2f %n",objTabung.hitungVolume());
 
        Kerucut objKerucut = new Kerucut();
        objKerucut.setJarijari(14);
        objKerucut.setTinggi(9);
        System.out.printf("Volume Kerucut adalah \t = %.2f %n", objKerucut.hitungVolume());
        
    }
    
}
