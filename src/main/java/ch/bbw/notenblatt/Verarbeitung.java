/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * country roads take me home to the place i belong west virginia mountain mama country roads take me home;D
 */
package ch.bbw.notenblatt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 5im15jakaur & Teodora Filipovic
 */
public class Verarbeitung {

    private String fileSchueler;
    private String fileLehrer;
    private ArrayList<Schueler> schuelerListe;
    private ArrayList<Lehrer> lehrerListe;

    public Verarbeitung() {
        fileSchueler = "KlassenNoten.csv";
        fileLehrer = "LehrpersonenB.csv";
        schuelerListe = new ArrayList<>();
        lehrerListe = new ArrayList<>();
    }

    //Die Notenliste wird eingelesen
    public void fileEinlesenSchueler() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileSchueler));
        br.readLine();
        String line = null;
        while ((line = br.readLine()) != null) {
            String s = line.replace(";", "");
            String[] lineParts = line.split(";");
            if (!s.equals("")) {
                schuelerListe.add(new Schueler(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2],
                        lineParts[3], lineParts[4], lineParts[5], lineParts[6], lineParts[7],
                        lineParts[8], lineParts[9], lineParts[10], lineParts[11], lineParts[12], lineParts[13]));
            }
        }
        br.close();
    }

    //die Lehrerliste wird eingelesen
    public void fileEinlesenLehrer() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileLehrer));
        br.readLine();
        String line = null;
        while ((line = br.readLine()) != null) {
            String s = line.replace(";", "");
            String[] lineParts = line.split(";");
            if (!s.equals("")) {
                lehrerListe.add(new Lehrer(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2],
                        lineParts[3], lineParts[4]));
            }
        }
        br.close();
    }

    public void fileAusgebenSchueler() throws EigeneException {
        for (Schueler schueler : schuelerListe) {

            System.out.println(schueler.getPersonenNummer() + " " + schueler.getVorname() + "\t" + schueler.getDeutsch() + "\t" + schueler.getFranzoesisch() + "\t" + schueler.getEnglisch() + "\t" + schueler.getPhysik()
                    + "\t" + schueler.getGeografie() + "\t" + schueler.getGeschichte() + "\t" + schueler.getChemie() + "\t" + schueler.getSport() + "\t" + schueler.getZeichnen() + "\t" + schueler.getMusik() + "\t" + schueler.getSchuelerDurchschnitt()
                    + "\t" + "\t" + schueler.summeTiefpunkte() + "\t" + "\t" + "\t" + schueler.anzahlTiefpunkte() + "\t"+ "\t"+ "\t" + schueler.promoviertOderNicht());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void fileAusgebenLehrer() {
        System.out.print("Lehrperson: " + "\t");
        for (Lehrer lehrer : lehrerListe) {
            System.out.print(lehrer.getKuerzel() + "\t");
        }
        System.out.print("Durschnitt" + "\t" + "Summe Tiefpunkte" + "\t" + "Anzahl Tiefnoten" + "\t" + "Promotionsentscheid");
        System.out.println("");
    }

    public static void main(String[] args) throws IOException, EigeneException  {
            Verarbeitung v = new Verarbeitung();
            v.fileEinlesenSchueler();
            v.fileEinlesenLehrer();
            v.fileAusgebenLehrer();
            v.fileAusgebenSchueler();
        } 
    }

