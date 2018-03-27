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
public class Kula {
 
    public double promien;

    public Kula(double promien) {
        this.promien = promien;
    }
    
    public void obliczPole(){
        System.out.println("Pole kuli: "+(4*Math.PI*Math.pow(promien, 2.0)));
    }
    
    public void obliczObjetosc(){
        System.out.println("Objetosc kuli: "+((4/3)*Math.PI*Math.pow(promien, 3.0)));
    }
    
    public void pokazDane(){
        System.out.println("Nazwa: Kula");
        System.out.print("Parametry: "); System.out.println("promien = "+promien);
        obliczPole();
        obliczObjetosc();
    }
    
}
