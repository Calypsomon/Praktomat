import java.util.*;
public class Caesar {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
       int k = SC.nextInt();
        char b = SC.next().charAt(0);
        char d = (char) (b + ((k) % 26));
    System.out.println(d);
    }
}