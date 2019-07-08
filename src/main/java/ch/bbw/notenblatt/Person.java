/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.notenblatt;

/**
 *
 * @author 5im15jakaur
 */
public class Person {

    private int personenNummer;
    private String nachname;
    private String vorname;

    public Person(int peronenNummer, String nachname, String vorname) {
        this.personenNummer = peronenNummer;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public int getPersonenNummer() {
        return personenNummer;
    }

    public void setPersonenNummer(int personenNummer) {
        this.personenNummer = personenNummer;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

}
