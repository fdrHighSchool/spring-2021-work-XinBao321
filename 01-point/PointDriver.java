import java.util.*;


public class PointDriver {
  public static void main(String[] args) {
    ArrayList<Point> ArrayList = new ArrayList<Point>();

    ArrayList.add(new Point(0, 0));
    ArrayList.add(new Point(2, 4));
    ArrayList.add(new Point(-6, 8));


    System.out.println(ArrayList.get(0).midpoint(ArrayList.get(1)).toString());
    System.out.println(ArrayList.get(0).distance(ArrayList.get(2)));
    System.out.println(ArrayList.get(0).isCollinear(ArrayList.get(1), ArrayList.get(2)));
   }
}
