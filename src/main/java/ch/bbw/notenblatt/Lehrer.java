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
public class Lehrer extends Person {

    private String kuerzel;
    private String fach;

    public Lehrer(int id, String kuerzel, String name, String vorname, String fach) {
        super(id, vorname, name);
        this.kuerzel = kuerzel;
        this.fach = fach;
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

}
