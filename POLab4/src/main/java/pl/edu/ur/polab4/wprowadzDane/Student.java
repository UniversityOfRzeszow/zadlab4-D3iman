/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Student {
    
    Scanner input = new Scanner(System.in);
    
    public String imie = "";
    public String nazwisko = "";
    public int nr_indeksu = 0;
    public String nazwa_specjalnosci = "";
    public int rok_studiow = 0;

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public Student(String imie) {
        this.imie = imie;
    }
    
    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }
    
    public Student(){
    }
    
    public void wprowadzDane(){
        System.out.print("Podaj imie: "); imie = input.nextLine();
        System.out.print("Podaj nazwisko: "); nazwisko = input.nextLine();
        System.out.print("Podaj nr_indeksu: "); nr_indeksu = input.nextInt();
        System.out.print("Podaj nazwa_specjalnosci: "); nazwa_specjalnosci = input.next();
        System.out.print("Podaj rok_studiow: "); rok_studiow = input.nextInt();
    }

    public void setImie() {
        System.out.println("Imie: ");
        imie = input.nextLine();
    }

    public void setNazwisko() {
        System.out.println("Nazwisko: ");
        nazwisko = input.nextLine();
    }

    public void setNr_indeksu() {
        System.out.println("Nr_indeksu: ");
        nr_indeksu = input.nextInt();
    }

    public void setNazwa_specjalnosci() {
        System.out.println("Nazwa_specjalnosci: ");
        nazwa_specjalnosci = input.nextLine();
    }

    public void setRok_studiow() {
        System.out.println("Rok_studiow: ");
        rok_studiow = input.nextInt();
    }
    
    public void usunDane(){
        imie = "";
        nazwisko = "";
        nr_indeksu = 0;
        nazwa_specjalnosci = "";
        rok_studiow = 0;
    }
    
    public void pokazDane() {
        System.out.println("Osoba: ");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("nr_indeksu: " + this.nr_indeksu);
        System.out.println("nazwa_specjalnosci: " + this.nazwa_specjalnosci);
        System.out.println("rok_studiow: " + this.rok_studiow);
        System.out.println("-------------------------");
    }
    
}
