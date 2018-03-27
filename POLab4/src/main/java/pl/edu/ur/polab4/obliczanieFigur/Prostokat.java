/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author student
 */
public class Prostokat {
    
    public double bok1;
    public double bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }
    
    public void obliczPole(){
        System.out.println("Pole prostokatu: "+(bok1*bok2));
    }
    
    public void obliczObwod(){
        System.out.println("Obwod prostokatu: "+(2*bok1+2*bok2));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Prostokat");
        System.out.print("Parametry: "); System.out.print("bok1 = "+bok1); System.out.println(" bok2 = "+bok2);
        obliczPole();
        obliczObwod();
    }
    
}
