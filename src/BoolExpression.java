public class BoolExpression {
    public static void main(String[] args) {
        int x=2;
        boolean wert1, wert2, result;
        wert1 = false;
        wert2 = true;

        while(x>0){
result = !wert1&(wert1|wert2);
System.out.println(result);
wert1 = true;
    x= x-1;
       }

    }
}
