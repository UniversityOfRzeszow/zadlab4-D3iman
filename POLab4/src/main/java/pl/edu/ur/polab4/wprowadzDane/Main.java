/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Deiman
 */
public class Main {
    
    public static void main(String[] args){
        
        int wybor = 1, wybor2 = 1, a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        
        Student[] student = new Student[100];
        for(int i = 0; i < 100; i++){
            student[i] = new Student();
        }
        
        while(wybor>0&&wybor<7){
            System.out.println("MENU: ");
            System.out.println("1. Wprowadz dane studenta");
            System.out.println("2. Edycja danych studenta");
            System.out.println("3. Usuniecie danych studenta");
            System.out.println("4. Wyswietl dane studenta");
            System.out.println("5. Wyswietl dane wszystkich studentow");
            System.out.println("6. Wyswietl zakres danych studentow");
            System.out.println("0. Wyjscie");
            
            System.out.print("Wybieram: "); wybor = input.nextInt();
            
         switch(wybor){
            case 1:
                System.out.print("Podaj numer indexu: "); a = input.nextInt();
                student[a].wprowadzDane();
                break;
            case 2:
                System.out.print("Podaj numer indexu: "); a = input.nextInt();
                while(wybor2>0&&wybor2<6){
                    System.out.println("Co zmienic?");
                    System.out.println("1. Imie");
                    System.out.println("2. Nazwisko");
                    System.out.println("3. Nr_indeksu");
                    System.out.println("4. Nazwa_specjalnosci");
                    System.out.println("5. Rok_studiow");
                    System.out.println("0. Wyjscie");
                    System.out.print("Wybieram: "); wybor2 = input.nextInt();
                    switch(wybor2){
                        case 1:
                            student[a].setImie();
                            break;
                        case 2:
                            student[a].setNazwisko();
                            break;
                        case 3:
                            student[a].setNr_indeksu();
                            break;
                        case 4:
                            student[a].setNazwa_specjalnosci();
                            break;
                        case 5:
                            student[a].setRok_studiow();
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 3:
                System.out.print("Podaj numer indexu: "); a = input.nextInt();
                student[a].usunDane();
                break;
            case 4:
                System.out.print("Podaj numer indexu: "); a = input.nextInt();
                student[a].pokazDane();
                break;
            case 5:
                for(int i = 0; i < 100; i++){
                    student[i].pokazDane();
                }
                break;
            case 6:
                System.out.println("Podaj zakres indexow: ");
                System.out.print("Od: "); a = input.nextInt();
                System.out.println("Do: "); b = input.nextInt();
                 for(int i = a; i <= b; i++){
                    student[i].pokazDane();
                 }
                break;
            default:
                break;
         }
        }
        
    }
    
}
