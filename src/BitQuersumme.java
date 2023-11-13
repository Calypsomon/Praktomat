import java.util.Scanner;

public class BitQuersumme {
    public static void main(String[] args) {
        int Bitwert = Integer.parseInt(args[0]);
        int lösung = 0;
        for(int i = 0;i <16; i++) {
            lösung = lösung + (Bitwert & 1);
            Bitwert =Bitwert >> 1;
        }
        System.out.println(lösung);
    }
}