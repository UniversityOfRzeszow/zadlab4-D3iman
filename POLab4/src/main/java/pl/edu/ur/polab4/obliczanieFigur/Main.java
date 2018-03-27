/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Deiman
 */
public class Main {
    
    public static void main(String[] args) {
        
        int wybor = 1;
        double promien,bok,bok1,bok2,wysokosc;
        Scanner input = new Scanner(System.in);
        while(wybor>0&&wybor<8){
            System.out.println("MENU: ");
            System.out.println("1. Kolo");
            System.out.println("2. Kula");
            System.out.println("3. Kwadrat");
            System.out.println("4. Prostokat");
            System.out.println("5. Prostopadloscian");
            System.out.println("6. Stozek");
            System.out.println("7. Szescian");
            System.out.println("0. Wyjscie");
            
            System.out.print("Wybieram: "); wybor = input.nextInt();
            
         switch(wybor){
            case 1:
                System.out.print("Podaj promien: "); promien = input.nextDouble();
                Kolo kolo = new Kolo(promien);
                kolo.pokazDane();
                break;
            case 2:
                System.out.print("Podaj promien: "); promien = input.nextDouble();
                Kula kula = new Kula(promien);
                kula.pokazDane();
                break;
            case 3:
                System.out.print("Podaj bok: "); bok = input.nextDouble();
                Kwadrat kwadrat = new Kwadrat(bok);
                kwadrat.pokazDane();
                break;
            case 4:
                System.out.print("Podaj bok1: "); bok1 = input.nextDouble();
                System.out.print("Podaj bok2: "); bok2 = input.nextDouble();
                Prostokat prostokat = new Prostokat(bok1,bok2);
                prostokat.pokazDane();
                break;
            case 5:
                System.out.print("Podaj bok1: "); bok1 = input.nextDouble();
                System.out.print("Podaj bok2: "); bok2 = input.nextDouble();
                System.out.print("Podaj wysokosc: "); wysokosc = input.nextDouble();
                Prostopadloscian prostopadloscian = new Prostopadloscian(bok1, bok2, wysokosc);
                prostopadloscian.pokazDane();
                break;
            case 6:
                System.out.print("Podaj promien: "); promien = input.nextDouble();
                System.out.print("Podaj wysokosc: "); wysokosc = input.nextDouble();
                Stozek stozek = new Stozek(promien, wysokosc);
                stozek.pokazDane();
                break;
            case 7:
                System.out.print("Podaj bok: "); bok = input.nextDouble();
                Szescian szescian = new Szescian(bok);
                szescian.pokazDane();
                break;
            default:
                break;
         }
        }
    }
    
}
