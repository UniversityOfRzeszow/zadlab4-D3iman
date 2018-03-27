/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {
    
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa_specjalnosci;
    public int rok_studiow;

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
