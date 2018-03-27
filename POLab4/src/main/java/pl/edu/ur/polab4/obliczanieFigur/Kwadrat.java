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
public class Kwadrat {
    
    public double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }
    
    public void obliczPole(){
        System.out.println("Pole kwadratu: "+(Math.pow(bok, 2.0)));
    }
    
    public void obliczObwod(){
        System.out.println("Obwod kwadratu: "+(4*bok));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Kwadrat");
        System.out.print("Parametry: "); System.out.println("bok = "+bok);
        obliczPole();
        obliczObwod();
    }
    
}
