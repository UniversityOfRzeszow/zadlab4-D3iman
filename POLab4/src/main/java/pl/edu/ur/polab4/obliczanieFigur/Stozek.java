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
public class Stozek {
    
    public double promien;
    public double wysokosc;
    public double tworzaca;

    public Stozek(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }
    
    public void obliczPole(){
        tworzaca = Math.sqrt(Math.pow(wysokosc, 2.0)+Math.pow(promien, 2.0));
        System.out.println("Pole stozka: "+(Math.PI*Math.pow(promien, 2.0)+Math.PI*promien*tworzaca));
    }
    
    public void obliczObjetosc(){
        System.out.println("Objetosc stozka: "+((1.0/3.0)*Math.PI*Math.pow(promien, 2.0)*wysokosc));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Stozek");
        System.out.println("Parametry: "); System.out.print("promien = "+promien); System.out.println("wysokosc = "+wysokosc);
        obliczPole();
        obliczObjetosc();
    }
    
}
