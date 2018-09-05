/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author WINDOWS 10
 */
public class Interfacesample {

    public static void main(String[] args) {
        InterfaceBujursangkar obyek1 = new InterfaceBujursangkar(10){};
        System.out.println("Luas Bujur Sangkar dengan sisi 10 = "+ obyek1.hitungluas());
        System.out.println("Kelilingnya = "+ obyek1.hitungkeliling());
        System.out.println("\n");
        InterfaceBangundatar obyek2 = new Interfacesegitiga(6,8){};
        System.out.println("Luas segitiga dengan alas 6, dan tinggi 8 = "+obyek2.hitungluas());
        System.out.println("Kelilingnya = "+obyek2.hitungkeliling());
    }
    
}
