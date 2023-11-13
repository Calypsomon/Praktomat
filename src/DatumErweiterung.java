import java.util.*;
public class DatumErweiterung {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
         int j = SC.nextInt();
         int m = SC.nextInt();
         int t = SC.nextInt();
         int s = SC.nextInt();
         int m1 = SC.nextInt();
         int m2 = SC.nextInt();
         SC.close();
         int m3 = m1 + m2;


         s = s + (m3/60);
         m3 = m3%60;
         t = t + (s/24);
         s =s%24;
         while(t>28) {
             if (t >= 29 & m == 2) {
                 t = t - 28;
                 m = m + 1;
             }
             if (t >= 31 & (m == 4 | m == 6 | m == 10 | m == 11)) {
                 t = t - 30;
                 m = m + 1;
             }
             if (t >= 32 & (m == 1 | m == 3 | m == 5 | m == 7 | m == 8 | m == 9 | m == 12)) {
                 t = t - 31;
                 m = m + 1;
             }
             if (t <= 29 & m != 2)
                       break;
         }
         j = j + (m/13);
         m = m%13;
        System.out.println(j +" " + m + " " + t +" " + s + " " + m3 );
         /*
         while(m3>59){
            m3 = m3 -60;
            s = s + 1;
        }

        while(s>23){
         s = s -24;
            t = t + 1;
        }

        int x = 28;

        while(t>=x){

            if (t>=29 & m==2)
            {t = t -28; m = m + 1;}
          if (t>=31 &(m==4 | m==6 | m==10 | m==11))
            {t = t -30; m = m + 1;}
          if (t>=32 &(m==1 | m==3 | m==5 | m==7 | m==8 | m==9 | m==12))
            {t = t -31; m = m + 1;}
          if (t<=29 & m!=2)
              x = x+99;
        }

        while(m>=13)
        { m = m -12;
            j = j + 1;}
        System.out.println(j +" " + m + " " + t +" " + s + " " + m3 );
        */
    }
}
