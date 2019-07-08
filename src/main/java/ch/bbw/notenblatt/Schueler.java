/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.notenblatt;

import java.text.DecimalFormat;

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

    private double summeTiefpunkte;
    private int anzahlTiefpunkte;
    private double durchschnitt;

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

    public Schueler(int id, String vorname, String name, String deutsch, String franzoesisch, String englisch, String mathematik, String physik, String geografie, String geschichte, String chemie, String sport, String zeichnen, String musik, double durchschnitt) {
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
        this.durchschnitt = durchschnitt;
        this.summeTiefpunkte = 0.0;
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

    public void setDurchschnitt(double durchschnitt) {
        this.durchschnitt = durchschnitt;
    }

    public double getDurchschnitt() {
        return durchschnitt;
    }

    //gibt den Durchschnitt eines Schülers zurück
    public String getSchuelerDurchschnitt() throws EigeneException{
        DecimalFormat f = new DecimalFormat("#0.00");
        durchschnitt = (Double.parseDouble(deutsch) + Double.parseDouble(franzoesisch)
                + Double.parseDouble(englisch) + Double.parseDouble(mathematik) + Double.parseDouble(physik)
                + Double.parseDouble(geografie) + Double.parseDouble(geschichte)
                + Double.parseDouble(chemie) + Double.parseDouble(sport)) / 9;
        if(durchschnitt> 6){
            throw new EigeneException("Ein Schueler kann keinen Durchschnitt über einer 6 haben!!");
        }
        String x = f.format(durchschnitt);
        return x;
    }

    
    // Berechnet die Summer der Tiefpunkte eines Schülers
    public String summeTiefpunkte() {
        DecimalFormat f = new DecimalFormat("#0.0");
        if (4 > Double.parseDouble(deutsch) && 4.0 - Double.parseDouble(deutsch) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(deutsch) && 4.0 - Double.parseDouble(deutsch) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(deutsch) && 4.0 - Double.parseDouble(deutsch) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(deutsch) && 4.0 - Double.parseDouble(deutsch) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(franzoesisch) && 4.0 - Double.parseDouble(franzoesisch) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(franzoesisch) && 4.0 - Double.parseDouble(franzoesisch) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(franzoesisch) && 4.0 - Double.parseDouble(franzoesisch) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(franzoesisch) && 4.0 - Double.parseDouble(franzoesisch) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(englisch) && 4 - Double.parseDouble(englisch) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(englisch) && 4.0 - Double.parseDouble(englisch) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(englisch) && 4.0 - Double.parseDouble(englisch) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(englisch) && 4.0 - Double.parseDouble(englisch) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(chemie) && 4 - Double.parseDouble(chemie) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(chemie) && 4.0 - Double.parseDouble(chemie) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(chemie) && 4.0 - Double.parseDouble(chemie) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(chemie) && 4.0 - Double.parseDouble(chemie) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(geografie) && 4 - Double.parseDouble(geografie) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(geografie) && 4.0 - Double.parseDouble(geografie) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(geografie) && 4.0 - Double.parseDouble(geografie) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(geografie) && 4.0 - Double.parseDouble(geografie) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(geschichte) && 4 - Double.parseDouble(geschichte) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(geschichte) && 4.0 - Double.parseDouble(geschichte) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(geschichte) && 4.0 - Double.parseDouble(geschichte) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(geschichte) && 4.0 - Double.parseDouble(geschichte) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(mathematik) && 4.0 - Double.parseDouble(mathematik) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(mathematik) && 4.0 - Double.parseDouble(mathematik) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(mathematik) && 4.0 - Double.parseDouble(mathematik) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(mathematik) && 4.0 - Double.parseDouble(mathematik) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        if (4 > Double.parseDouble(sport) && 4 - Double.parseDouble(sport) == 0.5) {
            summeTiefpunkte = summeTiefpunkte + 1;
        } else if (4 > Double.parseDouble(sport) && 4.0 - Double.parseDouble(sport) == 1.0) {
            summeTiefpunkte = summeTiefpunkte + 2;
        } else if (4 > Double.parseDouble(sport) && 4.0 - Double.parseDouble(sport) == 1.5) {
            summeTiefpunkte = summeTiefpunkte + 3;
        } else if (4 > Double.parseDouble(sport) && 4.0 - Double.parseDouble(sport) == 2.0) {
            summeTiefpunkte = summeTiefpunkte + 4;
        }
        String x = f.format(summeTiefpunkte / 2);
        return x;
    }

    
    //Berechnet die Anzahl Tiefpunkte eines Schülers
    public int anzahlTiefpunkte() {
        anzahlTiefpunkte = 0;
        if (Double.parseDouble(deutsch) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(franzoesisch) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(englisch) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(mathematik) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(physik) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(geografie) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(geschichte) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(chemie) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        if (Double.parseDouble(sport) < 4.0) {
            anzahlTiefpunkte += 1;
        }
        return anzahlTiefpunkte;
    }
    
    
    //Schaut nach ob ein Schüler das Semester bestanden hat oder nicht
    public String promoviertOderNicht(){
        String x = "";
        if(durchschnitt >=4 && anzahlTiefpunkte <=3 && summeTiefpunkte <5){
           x = "DEF_PR";
        }else{
            x = "N_PROM";
        }
        return x;
    }

}
