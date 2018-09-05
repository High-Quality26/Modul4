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
public class Truck {
    public int cadance;
    public int gear;
    public int speed;
    
public Truck(int startCadance, int startSpeed, int startGear)
{
    gear = startGear;
    cadance = startCadance;
    speed = startSpeed;
}
public void setCadance (int newValue)
{
    cadance = newValue;
}
public void setGear (int newValue)
{
    gear = newValue;
}
public void applybrake (int decrement)
{
    speed = decrement;
}
public void speedUp (int increment)
{
    speed = increment;
}
}
