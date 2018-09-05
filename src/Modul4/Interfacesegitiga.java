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
public class Interfacesegitiga implements InterfaceBangundatar {
  private double alas;
  private double tinggi;
  
  public Interfacesegitiga(double alas, double tinggi){
      this.alas=alas;
      this.tinggi=tinggi;
  }
  @Override
  public double hitungkeliling(){
      return 2 * alas+tinggi;
  }
  public double hitungluas(){
      return ((alas*tinggi)/2);
  }
}
