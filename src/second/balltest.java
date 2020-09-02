package second;
import java.lang.*;
public class balltest {
    public static void main(String[] args) {
        ball d1 = new ball("white-black", "soccer ball");
        ball d2 = new ball("white-blue", "volleyball");
        ball d3 = new ball("orange-black", "tennisball");
        d3.setDescription("basketball");
        System.out.print("first ball: ");System.out.println(d1);
        d2.setColor("light-green");
        System.out.print("second ball: ");System.out.print(d2);
    }
}
