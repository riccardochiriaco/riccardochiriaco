/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greenpasses;

/**
 *
 * @author tss
 */
public class Greenpasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //data oggi
        int oggi = 749;
        //dati VALIDITA' ministero
        int durata_v1 = 30;
        int durata_v2 = 120;
        int durata_v3 = 120;
        int durata_tampone = 2;
        int durata_covid = 180;
        //inizializzo dati persona
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int tampone = 0;
        int covid = 0;
        
        //ora provo a usare dei valori di prova sensati es. un mese fa
        
        v1 = 700;
        int dv1 = oggi -v1;
        boolean okv1 = dv1 <=durata_covid;
        
        v2 = 700;
        int dv2 = oggi -v2;
        boolean okv2 = dv1 <=durata_covid;
        
        v3 = 700;
        int dv3 = oggi -v3;
        boolean okv3 = dv3 <=durata_covid;
        
        covid = 700;
        int dcovid = oggi - covid;
        boolean okcovid = dcovid <=durata_covid;
        
        tampone = 700;
        int dtampone = oggi -tampone;
        boolean oktampone = dtampone <=durata_tampone;
        
        boolean greenpass = okcovid || oktampone || okv1 || okv2 || okv2;
        
        if (greenpass) {
            System.out.println("OK! GREEN PASS VALIDO.");
        } else {
            System.out.println("ATTENZIONE!! GREEN PASS NON VALIDO!!");
                        }
    }
}