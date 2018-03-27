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
public class Prostopadloscian {
    
    public double bok1;
    public double bok2;
    public double wysokosc;

    public Prostopadloscian(double bok1, double bok2, double wysokosc) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.wysokosc = wysokosc;
    }
    
    public void obliczPole(){
        System.out.println("Pole prostopadloscianu: "+(2*bok1*bok2+2*bok2*wysokosc+2*bok1*wysokosc));
    }
    
    public void obliczObjetosc(){
        System.out.println("Objetosc prostopadloscianu: "+(bok1*bok2*wysokosc));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Prostopadloscian");
        System.out.print("Parametry: "); System.out.print("bok1 = "+bok1); System.out.print(" bok2 = "+bok2); System.out.println(" wysokosc = "+wysokosc);
        obliczPole();
        obliczObjetosc();
    }
    
}
