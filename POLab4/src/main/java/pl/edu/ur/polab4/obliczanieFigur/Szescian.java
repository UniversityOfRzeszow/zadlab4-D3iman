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
public class Szescian {
    
    public double bok;

    public Szescian(double bok) {
        this.bok = bok;
    }
    
    public void obliczPole(){
        System.out.println("Pole szescianu: "+(6*Math.pow(bok, 2.0)));
    }
    
    public void obliczObjetosc(){
        System.out.println("Objetosc szescianu: "+(Math.pow(bok, 3.0)));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Szescian");
        System.out.println("Parametry: "); System.out.println("bok = "+bok);
        obliczPole();
        obliczObjetosc();
    }
    
}
