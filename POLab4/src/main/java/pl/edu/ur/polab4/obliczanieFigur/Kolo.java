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
public class Kolo {
    
    public double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }
    
    public void obliczPole(){
        System.out.println("Pole kola: "+(Math.PI*Math.pow(promien, 2.0)));
    }
    
    public void obliczObwod(){
        System.out.println("Obwod kola: "+(2*Math.PI*promien));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Kolo");
        System.out.print("Parametry: "); System.out.println("promien = "+promien);
        obliczPole();
        obliczObwod();
    }
    
}
