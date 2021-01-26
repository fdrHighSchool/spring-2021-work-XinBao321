public class Driver{
  public static void main(String[] args) {
    SuperArray array1 = new SuperArray(8);
    array1.add(100);
    array1.add(35);
    array1.add(62);
    array1.add(33);
    array1.add(50);
    array1.add(92);
    array1.add(72);
    array1.add(12);
    array1.add(32);
    array1.add(92);
    array1.add(72);
    array1.add(102);

    System.out.println(array1);
    array1.add(3,661);
    System.out.println(array1);
    array1.grow(2);
    System.out.println(array1);
    System.out.println(array1.isEmpty());
  } //end main
} //end class
