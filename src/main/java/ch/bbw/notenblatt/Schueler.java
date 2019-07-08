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
public class Schueler extends Person {

    private String deutsch;
    private String franzoesisch;
    private String englisch;
    private String mathematik;
    private String physik;
    private String geografie;
    private String geschichte;
    private String chemie;
    private String sport;
    private String zeichnen;
    private String musik;

    public Schueler(int id, String vorname, String name, String deutsch, String franzoesisch, String englisch, String mathematik, String physik, String geografie, String geschichte, String chemie, String sport, String zeichnen, String musik) {
        super(id, vorname, name);
        this.deutsch = deutsch;
        this.franzoesisch = franzoesisch;
        this.englisch = englisch;
        this.mathematik = mathematik;
        this.physik = physik;
        this.geografie = geografie;
        this.geschichte = geschichte;
        this.chemie = chemie;
        this.sport = sport;
        this.zeichnen = zeichnen;
        this.musik = musik;
    }

    public String getDeutsch() {
        return deutsch;
    }

    public void setDeutsch(String deutsch) {
        this.deutsch = deutsch;
    }

    public String getFranzoesisch() {
        return franzoesisch;
    }

    public void setFranzoesisch(String franzoesisch) {
        this.franzoesisch = franzoesisch;
    }

    public String getEnglisch() {
        return englisch;
    }

    public void setEnglisch(String englisch) {
        this.englisch = englisch;
    }

    public String getMathematik() {
        return mathematik;
    }

    public void setMathematik(String mathematik) {
        this.mathematik = mathematik;
    }

    public String getPhysik() {
        return physik;
    }

    public void setPhysik(String physik) {
        this.physik = physik;
    }

    public String getGeografie() {
        return geografie;
    }

    public void setGeografie(String geografie) {
        this.geografie = geografie;
    }

    public String getGeschichte() {
        return geschichte;
    }

    public void setGeschichte(String geschichte) {
        this.geschichte = geschichte;
    }

    public String getChemie() {
        return chemie;
    }

    public void setChemie(String chemie) {
        this.chemie = chemie;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getZeichnen() {
        return zeichnen;
    }

    public void setZeichnen(String zeichnen) {
        this.zeichnen = zeichnen;
    }

    public String getMusik() {
        return musik;
    }

    public void setMusik(String musik) {
        this.musik = musik;
    }
    
    public void getDurchschnitt(){
      //  Integer.parseInt(deutsch)
    }

}
