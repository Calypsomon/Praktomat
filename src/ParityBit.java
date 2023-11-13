public class ParityBit {
    public static void main(String[] args) {
        int x = 4;
        int wert =0x17;
        int lösung = 0;
        int warheitswert = (wert & 0x1);
        boolean lösung2 = true;


    while(x>0) {
   wert =wert >> 1;
lösung = lösung + (wert & 0x1);
x =x-1;
    }

if(warheitswert==lösung % 2)
    lösung2 = true;
    else
    lösung2 = false;

System.out.println(lösung2);
System.out.println(lösung);
System.out.println(warheitswert);
    }
}
