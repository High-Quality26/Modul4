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
public class InterfaceBujursangkar implements InterfaceBangundatar{
private double sisi;

public InterfaceBujursangkar(double sisi){
    this.sisi=sisi;
}
@Override
public double hitungkeliling(){
    return sisi*4;
}
@Override
public double hitungluas(){
    return sisi*sisi;
}
}
