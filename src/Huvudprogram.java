import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Huvudprogram {

    Huvudprogram() {
        //Vill bara ha en List. Uppgiften är löst utifrån det.
        List<Växt> växtlista = new ArrayList<>();

        //Skapa olika växter.
        Kaktus k1 = new Kaktus("Igge", 0.2);
        Palm p1 = new Palm("Laura", 5);
        KöttätandeVäxt kv1 = new KöttätandeVäxt("Meatloaf", 0.7);
        Palm p2 = new Palm("Olof", 1);

        //Lägg till dem i arraylist.
        växtlista.add(k1);
        växtlista.add(p1);
        växtlista.add(kv1);
        växtlista.add(p2);

        //Variabler utanför loopen så de kan nås från överallt.
        String växtNamn = "";
        Växt hittadVäxt;
        String vätsketyp;

        //Kör programmet i en loop.
        while (true) {
            //Fråga efter växt.
            String fråga = "Vilken växt ska få vätska? ";
            try {
                växtNamn = JOptionPane.showInputDialog(fråga).trim();
            } catch (NullPointerException npe) {
                //Programmet avslutas.
                System.exit(0);
            }
            //Började med att skapa en version för terminalen. Lät den ligga kvar.
            //System.out.println(fråga);
            //String växtNamn = input.nextLine().trim();

            //Hitta växt.
            hittadVäxt = getVäxt(växtNamn, växtlista);
            if (hittadVäxt == null) {
                String hittadeInteVäxt = "Växten hittades inte. ";
                JOptionPane.showMessageDialog(null, hittadeInteVäxt);
                //System.out.println(hittadeInteVäxt);
            } else {

                //Beräkna bevattning.
                //Tror det här är polymorfism.
                double mängdVätska = hittadVäxt.getMängdVätska();

                //Typ av vätska.
                //Det här är nog också polymorfism.
                vätsketyp = hittadVäxt.getVätsketyp();
                if (vätsketyp == null) {
                    String hittadeInteVätsketyp = "Vätsketyp hittades inte. ";
                    JOptionPane.showMessageDialog(null, hittadeInteVätsketyp);
                    //System.out.println(hittadeInteVätsketyp);
                } else {

                    //Skriv ut svar.
                    String svar = "Vattna " + mängdVätska + " liter med " + vätsketyp.toLowerCase() + ".";
                    JOptionPane.showMessageDialog(null, svar);
                    //System.out.println(svar);
                }
            }
        }
    }

    //Hitta en växt.
    public Växt getVäxt(String namn, List<Växt> växtlista) {
        for (Växt v : växtlista) {
            if (v.getNamn().equalsIgnoreCase(namn)) {
                return v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
    }
}
