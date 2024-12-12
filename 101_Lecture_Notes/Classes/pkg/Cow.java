/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    int numberSpots;
    int moosPerHour;
    String flavor;
    boolean isBeef;
    public Cow() {
        numberSpots = 17;
        flavor = "wagyu";
        isBeef = false;
        if(isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
    }
    
    public Cow(int n, String f, boolean b) {
        numberSpots = n;
        flavor = f;
        isBeef = b;
        if(isBeef)
            moosPerHour = 0;
        else 
            moosPerHour = 87;
    }
    
    public String getFlavor() {
        return flavor;
    }
    public void moo() {
        if(!isBeef) {
            int i = 0;
            while(i < moosPerHour) {
                System.out.println("moo");
                i++;
            }
        }
        else 
            System.out.println("Your " + flavor + " cow is beef");
    }
}