/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author WINDOWS 10
 */
public class KonstruktorSuperKelas {
    public static void main(String[] args) {
      Employ programer1 = new Employ ("12345678","Yanto",32);
      programer1.info();
      
      System.out.println();
      Person aku = new Person ("Zidane",07);
      aku.info();
    }         
}
