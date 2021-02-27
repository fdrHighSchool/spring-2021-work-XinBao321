import java.util.*;


public class Point {
  public static void main(String[] args) {
    ArrayList<Point> myList = new ArrayList<Point>();

    myList.add(new Point(0, 0));
    myList.add(new Point(2, 4));
    myList.add(new Point(-6, 8));


    System.out.println(myList.get(0).midpoint(myList.get(1)).toString());
    System.out.println(myList.get(0).distance(myList.get(2)));
    System.out.println(myList.get(0).isCollinear(myList.get(1), myList.get(2)));
   }
}
