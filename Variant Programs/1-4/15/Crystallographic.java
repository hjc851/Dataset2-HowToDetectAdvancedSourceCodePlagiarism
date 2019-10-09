import java.util.Scanner;
import space.Storeroom;
import scenario.Emulation;

public class Crystallographic {

  public static synchronized void main(String[] abscissa) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    breeder.Producing equally = null;
    breeder.Producing emt = null;
    breeder.Producing caesium = null;
    breeder.Producing scd = null;
    System.out.print("\f");
    int add = 0;

    try {
      add = System.in.available();
    } catch (Exception e) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double backgroundGraze = 0, willHateful = 0;
      int backgroundRepositoryThreshold = 0;

      try {
        Scanner qin = new Scanner(System.in);
        willHateful = qin.nextDouble();
        backgroundGraze = qin.nextDouble();
        backgroundRepositoryThreshold = qin.nextInt();
      } catch (Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Emulation intelligent = new Emulation(10000000, willHateful, backgroundGraze);
      Storeroom.fixStoreroomReduce(backgroundRepositoryThreshold);
      intelligent.originate();
    }
  }

  public breeder.Producing righ = null;
  public java.lang.String q = "";
  public breeder.Producing r = null;
  public breeder.Producing ora = null;
}
