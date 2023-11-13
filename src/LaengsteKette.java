import java.util.Scanner;

public class LaengsteKette {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int stelle = 0;
        int momentanelänge = 0;
        int längstelänge = 0;
        while(SC. hasNextInt()) {
            int i = SC.nextInt();

            if(i == stelle) {
                momentanelänge++;
            }
            else {
                momentanelänge = 1;
                stelle = i;
            }
        if (momentanelänge>längstelänge)
            längstelänge = momentanelänge;


        }
        System.out.println(längstelänge);
    }
}
