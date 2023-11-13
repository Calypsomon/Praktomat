import java.util.Scanner;

public class Lauflaengenkodierung {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int momentanestelle =-1;
        int momentanelaenge = 0;
        String p = "";
        while(SC. hasNextInt()) {
            int i = SC.nextInt();               // es wird eine Zahl eingegeben
            if (momentanestelle==-1) {
                momentanestelle = i;
            }                   // wenn die zahl die erste Zahl ist wird sie so übernommen
            else
                if (momentanestelle != i) {
                    p = p +momentanelaenge + "x" + momentanestelle +".";
                    momentanestelle = i;                //wenn nicht wird eins hochgezählt
                    momentanelaenge = 0;
                }
            if (momentanestelle==i)
                momentanelaenge = momentanelaenge+1;
        }
        p = p +momentanelaenge + "x" + momentanestelle +".";
        System.out.println(p);
    }
}
